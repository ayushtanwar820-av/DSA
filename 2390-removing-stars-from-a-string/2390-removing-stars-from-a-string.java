class Solution {
    public String removeStars(String s) {
        int i=0 ;
        StringBuilder temp = new StringBuilder(s) ;
        int size = temp.length() ;

        while(i < size){
            char ch = temp.charAt(i) ;

            if(ch == '*'){ 
                temp.deleteCharAt(i) ;
                i-- ; 
                size-- ;
                if(i >= 0){
                    temp.deleteCharAt(i) ;
                    size-- ;
                }
            }
            else{
                i++ ;
            }
        }

        return temp.toString() ;
    }
}