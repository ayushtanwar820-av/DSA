class Solution {
    public boolean judgeSquareSum(int c) {
        int start = 0 ;
        long end = (long)Math.sqrt(c) ;

        while(start <= end){
            long temp = start*start + end*end ;

            if(temp == c) return true ;
            else if(temp > c) end-- ;
            else start++ ;
        }

        return false ;
    }
}