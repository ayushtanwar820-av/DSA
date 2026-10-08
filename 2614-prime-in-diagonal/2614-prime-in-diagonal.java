class Solution {
    public int diagonalPrime(int[][] nums) {
        int ans = 0 ;
        int size = nums.length ;

        for(int j=0 ; j<size ; j++){
            int num1 = nums[j][j] ;
            int num2 = nums[j][size-j-1] ;
            boolean isPrime = true ;

            for(int i=2 ; i*i<=num1 ; i++){
                if(num1 % i == 0) isPrime = false ;
            }

            if(num1 < 2) isPrime = false ;
            if(isPrime && num1>ans) ans = num1 ;
            isPrime = true ;

            for(int i=2 ; i*i<=num2 ; i++){
                if(num2 % i == 0) isPrime = false ;
            }

            if(num2 < 2) isPrime = false ;
            if(isPrime && num2>ans) ans = num2 ;
        }

        return ans ;
    }
}