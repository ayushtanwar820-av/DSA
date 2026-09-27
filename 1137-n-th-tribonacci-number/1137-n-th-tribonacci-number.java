class Solution {
    public int tribonacci(int n) {

        if(n == 0) return 0;
        int ans = 1 ;

        int prev3 = 0 ;
        int prev2 = 1 ;
        int prev1 = 1 ;

        int i = 3 ;
        while(i <= n){
            int temp = ans ;
            ans = prev1 + prev2  + prev3 ;
            prev3 = prev2 ;
            prev2 = prev1 ;
            prev1 = ans ;

            i++ ;
        }

        return ans ;
    }
}