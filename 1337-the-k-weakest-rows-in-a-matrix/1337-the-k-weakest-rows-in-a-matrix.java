class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int row = mat.length ;
        int col = mat[0].length ;

        int[] weakRows = new int[k] ;
        int[] soldiers = new int[row] ;
        int[] rowIdx = new int[row] ;

        for(int i=0 ; i<row ; i++){
            int sum = 0;
            for(int j=0 ; j<col ; j++){
                sum += mat[i][j] ;
            }
            soldiers[i] = sum ;
            rowIdx[i] = i ;
        }

        for(int i=0 ; i<row ; i++){
            int minIdx = i ;

            for(int j=i+1 ; j<row ; j++){
                
                if( (soldiers[minIdx] > soldiers[j]) || (soldiers[minIdx] == soldiers[j] && rowIdx[minIdx]>rowIdx[j]) ){
                    minIdx = j ;
                }
            }

            int temp = soldiers[i] ;
            soldiers[i] = soldiers[minIdx] ;
            soldiers[minIdx] = temp ;
            
            temp = rowIdx[i] ;
            rowIdx[i] = rowIdx[minIdx] ;
            rowIdx[minIdx] = temp ;
        }

        for(int i=0 ; i<k ; i++){
            weakRows[i] = rowIdx[i] ;
        }

        return weakRows ;
    }
}