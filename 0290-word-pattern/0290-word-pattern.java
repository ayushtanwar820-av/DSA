class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String , Character> wordToChar = new HashMap() ;
        HashMap<Character , String> charToWord = new HashMap() ;


        String[] words = s.split(" ") ;
        int size = words.length ;
        if(pattern.length() != size) return false ;

        for(int i=0 ; i<size ; i++){

            char ch = pattern.charAt(i) ;
            String word = words[i] ;

            if(wordToChar.containsKey(word) && (wordToChar.get(word) != ch)){
                return false ;
            }
            if(charToWord.containsKey(ch) && !(charToWord.get(ch).equals(word))){
                return false ;
            }

            charToWord.put(ch , word) ;
            wordToChar.put(word , ch) ;
        }

        return true ;
    }
}