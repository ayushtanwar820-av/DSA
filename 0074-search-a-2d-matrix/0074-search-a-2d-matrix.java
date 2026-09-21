class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = matrix.length ;
        int col = matrix[0].length ;

        int start = 0 , end = (row*col)-1 ;

        while(start <= end){
            int mid = start + (end-start)/2 ;
            
            int rowIdx = mid/col ;
            int colIdx = mid%col ;

            if(matrix[rowIdx][colIdx] == target){
                return true ;
            }
            else if(matrix[rowIdx][colIdx] > target){
                end = mid-1 ;
            }
            else{
                start = mid+1 ;
            }
        }
        return false ;
    }
}