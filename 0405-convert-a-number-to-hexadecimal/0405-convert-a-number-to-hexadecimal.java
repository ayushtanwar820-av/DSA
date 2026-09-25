class Solution {
    public String toHex(int num) {

        if(num == 0) return "0" ;
        
        int temp = 0x0000000f ;
        String ans = "" ;

        while(num != 0){
            int bit = temp&num ;

            if(bit < 10){
                ans = bit + ans ;
            }
            else{
                ans = (char)(bit+87) + ans ;
            }

            num = num >>> 4 ;
        }

        return ans ;
    }
}