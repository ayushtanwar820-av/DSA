class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int row = 0 ;
        int col = 0 ;
        int[] result = new int[2] ;

        int totalRow = grid.length ;
        int totalCol = grid[0].length ;

        while((col < totalCol) && (row < totalRow) && (grid[row][col] != '.')){
            char move = grid[row][col] ;
            grid[row][col] = '.' ;

            if(move == 'D'){
                if((row+1 >= totalRow) || (grid[row+1][col] == '.')) break ;
                row += 1 ;
            } 
            else if (move == 'L'){
                if((col-1 < 0) || (grid[row][col-1] == '.')) break ;
                col -= 1 ;
            }
            else if(move == 'R'){
                if((col+1 >= totalCol) || (grid[row][col+1] == '.')) break ;
                col += 1 ;
            }
            else{
                if((row-1 < 0) || (grid[row-1][col] == '.')) break ;
                row -= 1 ;
            }
        }

        result[0] = row ;
        result[1] = col ;

        return result ;
    }
}