class Solution {
    public boolean checkPerfectNumber(int num) {
        int sumOfDivisor = 1 ;
        if(num == 1) return false ;

        for(int i=2 ; i*i<=num ; i++){
            if(num % i == 0){
                int firstDivisor = i ;
                int secondDivisor = num/i ;

                sumOfDivisor += (firstDivisor + secondDivisor) ;
            }

            System.out.println(sumOfDivisor) ;
        }
        

        return sumOfDivisor == num ;
    }
}