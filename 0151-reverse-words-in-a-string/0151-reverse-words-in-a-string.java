class Solution {
    public String reverseWords(String s) {
        s = s.trim() ;
        String result = "" ;

        String[] words = s.split(" ") ;
        int size = words.length ;

        for(int i=size-1 ; i>=0 ; i--){
            if(words[i] != ""){
                    result += words[i] ;
                if(i != 0){
                    result += " " ; 
                }
            }
        }

        return result ;
    }
}