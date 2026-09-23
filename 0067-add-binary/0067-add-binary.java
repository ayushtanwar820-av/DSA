class Solution {
    public String addBinary(String a, String b) {
        int currentA = a.length()-1 ;
        int currentB = b.length()-1 ;

        String c = "" ;
        int carry = 0 ;

        while((currentA >= 0) && (currentB >= 0)){
            int x = (int)a.charAt(currentA) - '0' ;
            int y = (int)b.charAt(currentB) - '0' ;

            c = ((x+y+carry)%2) + c ;
            carry = (x+y+carry) / 2 ;

            currentA-- ;
            currentB-- ;
        }
        
        while(currentA >= 0){
            int x = (int)a.charAt(currentA) - '0' ;

            c = ((x+carry)%2) + c ;
            carry = (x+carry) / 2 ;
            
            currentA-- ;
        }
        
        while(currentB >= 0){
            int y = (int)b.charAt(currentB) - '0' ;

            c = ((y+carry)%2) + c ;
            carry = (y+carry) / 2 ;
            
            currentB-- ;
        }

        if(carry == 1){
            c = "1" + c ;
        }

        return c ;
    }
}