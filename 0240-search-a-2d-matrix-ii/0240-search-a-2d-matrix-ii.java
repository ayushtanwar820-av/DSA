class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length ;
        int cols = matrix[0].length ;

        int rowIdx = 0 ;
        int colIdx = cols-1 ;

        while((rowIdx < rows) && (colIdx >=0)){
            if(matrix[rowIdx][colIdx] == target){ 
                return true ;
            }
            else if(matrix[rowIdx][colIdx] > target){
                colIdx-- ;
            }
            else{
                rowIdx++ ;
            }
        }
        return false ;
    }
}