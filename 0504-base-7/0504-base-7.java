class Solution {
    public String convertToBase7(int num) {

        if(num == 0) return "0" ;
        
        String ans = "" ;
        long n = 0 ;

        if(num < 0) n = -num ;
        else n = num ;

        while(n > 0){
            int bit = ((int)n)%7 ;
            ans = bit + ans ;
            
            n /= 7 ;
        } 

        if(num < 0) ans = '-' + ans ;

        return ans ;
    }
}