class Solution {
    public String removeDuplicates(String s) {
        StringBuilder temp = new StringBuilder(s) ;
        int i=0 ;

        while(i < temp.length()-1){
            if(temp.charAt(i) == temp.charAt(i+1)){
                temp.delete(i , i+2) ;
                i-- ;
                if(i < 0) i = 0 ;
            }
            else{
                i++ ;
            }
        }

        return temp.toString() ;
    }
}