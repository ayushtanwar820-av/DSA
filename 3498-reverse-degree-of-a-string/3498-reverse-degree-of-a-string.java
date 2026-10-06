class Solution {
    public int reverseDegree(String s) {
        int size = s.length() ;
        int ans = 0 ;
        
        for(int i=0 ; i<size ; i++){
            char ch = s.charAt(i) ;
            int reverseDegree = (26 - (ch-'a')) ;
            ans += (reverseDegree*(i+1)) ;
        }

        return ans ;
    }
}