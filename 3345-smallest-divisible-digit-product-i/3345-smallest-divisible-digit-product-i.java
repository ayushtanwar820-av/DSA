class Solution {
    public int smallestNumber(int n, int t) {
        int remainder = 0 ;

        do{
            int product = 1 ;
            int num = n ;

            while(num > 0){
                int digit = num%10 ;
                num /= 10 ;
                product *= digit ;
            }

            remainder = product%t ;
            n++ ;
        }while(remainder != 0) ;

        return n-1 ;
    }
}