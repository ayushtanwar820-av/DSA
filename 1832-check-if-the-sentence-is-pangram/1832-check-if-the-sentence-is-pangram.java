class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] alphabet = new boolean[26] ;
        int size = sentence.length() ;

        for(int i=0 ; i<size ; i++){
            int idx = sentence.charAt(i) - 'a' ;
            alphabet[idx] = true ;
        } 

        for(int i=0 ; i<26 ; i++){
            if(!alphabet[i]){
                return false ;
            }
        }

        return true ;
    }
}