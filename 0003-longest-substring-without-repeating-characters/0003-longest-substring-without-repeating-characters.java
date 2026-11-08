class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size = s.length();
        int maxLength = 0;
        
        for(int i=0 ; i<size ; i++){
            int length = 1;
            int idx = i+1;

            while(idx<size && !contains(s.substring(i, idx), s.charAt(idx))){
                length++;
                idx++;
            }

            maxLength = Math.max(length, maxLength);
        }

        return maxLength;
    }

    public boolean contains(String s, char ch){
        int size = s.length();

        for(int i=0 ; i<size ; i++){
            if(s.charAt(i) == ch) return true;
        }

        return false;
    }
}