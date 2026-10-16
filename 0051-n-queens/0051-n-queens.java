class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] row : board){
            Arrays.fill(row , '.');
        }

        queensPositions(board, result, 0);
        return result;
    }

    public void queensPositions(char[][] board, List<List<String>> result, int row) {
        int n = board.length;
        if(row >= n){
            result.add(buildSolution(board));
            return;
        }

        for(int col=0 ; col<n ;col++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q' ;
                queensPositions(board, result, row+1) ;
                board[row][col] = '.' ;
            }
        }
    }

    public boolean isSafe(char[][] board, int row, int col) {
        int n = board.length ;

        for(int r=0 ; r<row ; r++){
            if(board[r][col] == 'Q') return false;
        }

        int r = row;
        int c = col;

        while((r >= 0) && (c >= 0)){
            if(board[r][c] == 'Q') return false;
            r--;
            c--;
        }

        r = row;
        c = col;
        while((r >= 0) && (c < n)){
            if(board[r][c] == 'Q') return false;
            r--;
            c++;
        }

        return true;
    }

    public List<String> buildSolution(char[][] board) {
        List<String> solution = new ArrayList<>();
        for(char[] row : board){
            solution.add(new String(row));
        }
        return solution;
    }
}