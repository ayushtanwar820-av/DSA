class Solution {
    public char findTheDifference(String s, String t) {
        
        HashMap<Character , Integer> freqS = new HashMap<>() ;
        HashMap<Character , Integer> freqT = new HashMap<>() ;
        char ans = ' ' ;

        for(int i=0 ; i<s.length() ; i++){
            freqS.put(s.charAt(i) , freqS.getOrDefault(s.charAt(i) , 0) + 1) ;
        }
        
        for(int i=0 ; i<t.length() ; i++){
            freqT.put(t.charAt(i) , freqT.getOrDefault(t.charAt(i) , 0) + 1) ;
        }

        for(int i=0 ; i<t.length() ; i++){
            int countT = freqT.getOrDefault(t.charAt(i) , 0) ;
            int countS = freqS.getOrDefault(t.charAt(i) , 0) ;
            

            if(countS+1 == countT){
                ans = t.charAt(i) ;
                break ;
            }
        }
        
        return ans ;
    }
}