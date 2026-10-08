class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ") ;
        StringBuilder result = new StringBuilder() ;
        int size = words.length ;

        for(int i=0 ; i<size ; i++){

            StringBuilder temp = new StringBuilder(words[i]) ;
            int wordLength = words[i].length() ;

            for(int j=0 ; j<wordLength ; j++){
                char ch = temp.charAt(j) ;
                if(ch>='A' && ch<='Z'){
                    temp.setCharAt(j , (char)((int)ch + 32)) ;
                }
            }

            if(wordLength > 2){
                char ch = temp.charAt(0) ;
                temp.setCharAt(0 , (char)((int)ch - 32)) ;
            }

            result.append(temp) ;
            if(i < size-1){
                result.append(" ") ;
            }
        }
        return result.toString() ;
    }
}