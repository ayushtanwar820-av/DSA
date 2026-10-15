class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>() ;
        String[] letters = {"" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"} ;

        allPossibleCombinations(digits , letters , result , new StringBuilder() , 0) ;
        return result ;
    }

    public void allPossibleCombinations(String digits , String[] letters , List<String> result , StringBuilder current , int idx){
        int size = digits.length() ;

        if(idx >= size){
            result.add(current.toString()) ;
            return ;
        }
        int num = digits.charAt(idx) - '0' ;
        String possibleLetters = letters[num] ;

        for(int i=0 ; i<possibleLetters.length() ; i++){
            char ch = possibleLetters.charAt(i) ;

            current.append(ch) ;
            allPossibleCombinations(digits , letters , result , current , idx+1) ;

            current.deleteCharAt(current.length()-1) ;
        }
    }
}