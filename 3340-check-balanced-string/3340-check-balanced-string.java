class Solution {
    public boolean isBalanced(String num) {
        int size = num.length() ;
        int oddSum = 0 ;
        int evenSum = 0 ;

        for(int i=0 ; i<size ; i++){
            int val = num.charAt(i) - '0' ;

            if((i&1) == 0){
                oddSum += val ;
            }
            else{
                evenSum += val ;
            }

        }

        return oddSum == evenSum ;
    }
}