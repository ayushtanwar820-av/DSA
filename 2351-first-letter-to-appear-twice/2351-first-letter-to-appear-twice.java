class Solution {
    public char repeatedCharacter(String s) {
        int[] alphabet = new int[26] ;
        int size = s.length() ;
        char ch = 'V' ;

        for(int i=0 ; i<size ; i++){

            ch = s.charAt(i) ;
            int idx = ch - 'a' ;

            if(alphabet[idx] != 0) return ch ;
            else alphabet[idx]++ ;

        }
        return ch ;
    }
}