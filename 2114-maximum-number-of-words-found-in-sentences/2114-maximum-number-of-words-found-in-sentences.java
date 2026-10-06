class Solution {
    public int mostWordsFound(String[] sentences) {
        int size = sentences.length ;
        int[] wordsCount = new int[size] ;
        int max = Integer.MIN_VALUE ; 

        for(int i=0 ; i<size ; i++){
            String[] temp = sentences[i].split(" ") ;
            wordsCount[i] = temp.length ;
        }

        for(int val : wordsCount){
            if(val > max){
                max = val ;
            }
        }
        
        return max ;
    }
}