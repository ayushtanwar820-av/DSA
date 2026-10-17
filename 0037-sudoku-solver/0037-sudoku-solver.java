class Solution {
    public void solveSudoku(char[][] board) {
        solve(board) ;
    }

    public boolean solve(char[][] board) {
        int[] emptyCell = new int[2] ;

        if(!isEmptyCell(board, emptyCell)){
            return true ;
        }

        int row = emptyCell[0] ;
        int col = emptyCell[1] ;

        for(char digit='1' ; digit<='9' ; digit++){
            if(isValid(board, digit, row, col)){
                
                board[row][col] = digit ;
                if(solve(board)) return true ;
                board[row][col] = '.' ;

            }
        }

        return false ;
    }

    public boolean isEmptyCell(char[][] board, int[] emptyCell){
        for(int i=0; i<9 ; i++){
            for(int j=0 ; j<9 ; j++){
                if(board[i][j] == '.'){
                    emptyCell[0] = i ;
                    emptyCell[1] = j ;
                    return true ;
                }
            }
        }

        return false ;
    }

    public boolean isValid(char[][] board, char digit, int row, int col) {
        
        // same row & same col
        for(int i=0 ; i<9 ; i++){
            if(board[i][col] == digit) return false ;
            if(board[row][i] == digit) return false ;
        }

        // 3X3 sub-box
        int startRow = row - (row%3) ;
        int startCol = col - (col%3) ;

        for(int i=startRow ; i<(startRow+3) ; i++){
            for(int j=startCol ; j<(startCol+3) ; j++){
                if(board[i][j] == digit) return false ;
            }
        }

        return true ;
    }
}