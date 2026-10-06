class Solution {
    public String makeGood(String s) {
        int size = s.length() ;
        StringBuilder temp = new StringBuilder(s) ;
        int i = 0 ;

        while(i < size-1){
            char currentCh = temp.charAt(i) ;
            char nextCh = temp.charAt(i+1) ;

            if((currentCh == nextCh+32) || currentCh+32 == nextCh){
                temp.deleteCharAt(i) ;
                temp.deleteCharAt(i) ;
                size -= 2 ;
                i-- ;
                if(i<0) i=0 ;
            } 
            else{
                i++ ;
            }
        }

        return temp.toString() ;
    }
}