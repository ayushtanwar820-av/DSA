class Solution {
    public boolean detectCapitalUse(String word) {

        if(word.length() < 2) return true ;

        if((word.charAt(0) >= 97) && (word.charAt(0) <= 122)){
            for(int i=1 ; i<word.length() ; i++){

                char ch = word.charAt(i) ;
                if(ch>122 || ch<97){
                    return false ;
                }
            }
        }
        else if((word.charAt(1) >= 65) && (word.charAt(1) <= 91)){
            for(int i=1 ; i<word.length() ; i++){

                char ch = word.charAt(i) ;
                if(ch>91 || ch<65){
                    return false ;
                }
            }
        }
        else{
            for(int i=1 ; i<word.length() ; i++){

                char ch = word.charAt(i) ;
                if(ch>122 || ch<97){
                    return false ;
                }
            }
        }

        return true ;
    }
}