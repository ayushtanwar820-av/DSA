class Solution {

    public double slope(int[][]coordinates , int rowIdx){
        int currentX = coordinates[rowIdx][0] ;
        int currentY = coordinates[rowIdx][1] ;
        
        int nextX = coordinates[rowIdx+1][0] ;
        int nextY = coordinates[rowIdx+1][1] ;

        double m = ((double)(nextY - currentY) / (nextX - currentX)) ;

        if((nextX - currentX) == 0) return Integer.MAX_VALUE ;

        return m ;
    }

    public boolean checkStraightLine(int[][] coordinates) {
        int rows = coordinates.length ;

        double m = slope(coordinates , 0) ;

        for(int i=1 ; i<rows-1 ; i++){
            double currentM = slope(coordinates , i) ;

            if(m != currentM) return false ;
        }

        return true ;
    }
}