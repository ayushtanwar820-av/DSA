class Solution {

    public boolean isAlphabet(char ch){
        if(ch>='A' && ch<='Z') return true ;
        if(ch>='a' && ch<='z') return true ;

        return false ;
    }

    public String reverseOnlyLetters(String s) {
        StringBuilder str = new StringBuilder(s) ;
        int i = 0 ;
        int j = str.length() - 1 ;

        while(i < j){

            char chI = str.charAt(i) ; 
            char chJ = str.charAt(j) ; 

            if(isAlphabet(chI) && isAlphabet(chJ)){
                char temp = str.charAt(i) ;
                str.setCharAt(i , str.charAt(j)) ;
                str.setCharAt(j , temp) ;
                i++ ;
                j-- ;
            }
            else if(!isAlphabet(chI)) i++ ;
            else j-- ;

        }

        return str.toString() ;
    }
}