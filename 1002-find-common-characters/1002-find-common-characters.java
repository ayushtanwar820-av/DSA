class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList() ;
        HashMap<Character , Integer> freq = new HashMap() ;

        for(int i=0 ; i<words[0].length() ; i++){
            freq.put(words[0].charAt(i) , freq.getOrDefault(words[0].charAt(i) , 0) + 1) ; 
        }

        for(int i=1 ; i<words.length ; i++){
            HashMap<Character , Integer> temp = new HashMap() ;
            
            for(int j=0 ; j<words[i].length() ; j++){
                temp.put(words[i].charAt(j) , temp.getOrDefault(words[i].charAt(j) , 0) + 1) ;
            }
            
            for(char ch : freq.keySet()){

                int freqStored = freq.getOrDefault(ch , 0) ; 
                int freqCurrent = temp.getOrDefault(ch , 0) ; 

                if (!temp.containsKey(ch)) {
                    freq.put(ch , 0);
                } else {
                    freq.put(ch, Math.min(freqStored, freqCurrent));
                }
            }
        }

        for(char ch : freq.keySet()){
            int count = freq.get(ch) ;

            while(count > 0){
                result.add(String.valueOf(ch)) ;
                count-- ;
            }
        }

        return result ;
    }
}