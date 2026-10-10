class Solution {
    public boolean checkDivisibility(int n) {

        int sum = 0 ;
        int product = 1 ;
        int num = n ;
        
        while(n > 0){
            int digit = n%10 ;
            n /= 10 ;

            sum += digit ;
            product *= digit ;

        }

        int sumPlusProduct = sum + product ;

        if(num % sumPlusProduct == 0) return true ;
        return false ;
    }
}