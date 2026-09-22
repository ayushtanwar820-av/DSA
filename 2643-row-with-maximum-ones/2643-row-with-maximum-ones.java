class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] result = new int[2] ;
        int rows = mat.length ;
        int cols = mat[0].length ;
        int maxOnesRow = 0 ;
        int maxOnes = 0 ;

        for(int i=0 ; i<rows ; i++){
            int ones = 0 ;
            for(int j=0 ; j<cols ; j++){
                if(mat[i][j] == 1){
                    ones++ ;
                }
            }

            if(ones > maxOnes){
                maxOnes = ones ;
                maxOnesRow = i ;
            }
        }

        result[0] = maxOnesRow ;
        result[1] = maxOnes ;

        return result ;
    }
}