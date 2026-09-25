class Solution {
    public boolean isPowerOfThree(int n) {
        long temp = 1 ;
        
        while(temp <= n){
            if(temp == n) return true ;

            temp = temp*3 ;
        }

        return false ;
    }
}