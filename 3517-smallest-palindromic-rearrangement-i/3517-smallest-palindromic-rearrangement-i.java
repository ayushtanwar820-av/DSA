class Solution {
    public String smallestPalindrome(String s) {
        int size = s.length() ;
        int[] frequency = new int[26] ;
        StringBuilder ans = new StringBuilder(s) ;

        for(int i=0 ; i<size ; i++){
            int idx = s.charAt(i) - 'a' ;
            frequency[idx]++ ;
        }

        int start = 0 ;
        int end = size-1 ;
        for(int i=0 ; i<26 ; i++){
            int freq = frequency[i] ;
            char ch = (char)(i + 'a') ;

            if((freq & 1) != 0){
                ans.setCharAt(size/2 , ch) ;
                freq-- ;
            }

            while(freq > 0){
                ans.setCharAt(start , ch) ;
                start++ ;
                freq-- ;

                ans.setCharAt(end , ch) ;
                end-- ;
                freq-- ;
            }
        }

        return ans.toString() ;
    }
}