class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26] ;
        int ans = -1 ;

        for(int i=0 ; i<s.length() ; i++){
            int idx = ((int)s.charAt(i)) - 97 ;

            freq[idx]++ ;
        }

        for(int i=0 ; i<s.length() ; i++){
            int idx = ((int)s.charAt(i)) - 97 ;

            if(freq[idx] == 1){
                ans = i ;
                break ;
            }
        }

        return ans ;
    }
}