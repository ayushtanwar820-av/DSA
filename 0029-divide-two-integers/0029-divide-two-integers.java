class Solution {
    public int divide(int dividend, int divisor) {

        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        long x = Math.abs((long) dividend);
        long y = Math.abs((long) divisor);

        long ans = 0;

        while(x >= y){

            long temp = y;
            long multiple = 1;

            while(x >= (temp << 1)){
                temp <<= 1;
                multiple <<= 1;
            }

            x -= temp;
            ans += multiple;
        }

        if((dividend < 0) ^ (divisor < 0)){
            ans = -ans;
        }

        return (int) ans;
    }
}