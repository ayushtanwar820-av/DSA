class Solution {
    public int commonFactors(int a, int b) {
        int ans = 1 ;
        int min = Integer.MAX_VALUE ;

        if(a > b) min = b ;
        else min = a ;

        for(int i=2 ; i<=min ; i++){
            
            if((a%i == 0) && (b%i == 0)){
                ans++ ;
            }

        }

        return ans ;
    }
}