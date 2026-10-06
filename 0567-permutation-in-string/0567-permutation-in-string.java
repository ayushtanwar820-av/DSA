class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character , Integer> freq = new HashMap<>() ;
        int subStrSize = s1.length() ;
        int size = s2.length() ;

        for(int i=0 ; i<subStrSize ; i++){
            char ch = s1.charAt(i) ;
            freq.put(ch , freq.getOrDefault(ch , 0)+1) ;
        }

        for(int i=0 ; i<=size-subStrSize ; i++){
            HashMap<Character , Integer> currFreq = new HashMap<>() ;
            for(int j=i ; j<subStrSize+i ; j++){
                char ch = s2.charAt(j) ;
                currFreq.put(ch , currFreq.getOrDefault(ch , 0)+1) ;
            }

            if(freq.equals(currFreq)) return true ;
        }

        return false ;
    }
}