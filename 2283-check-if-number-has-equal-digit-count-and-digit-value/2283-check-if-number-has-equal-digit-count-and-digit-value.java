class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer , Integer> frequency = new HashMap<>() ;
        int size = num.length() ;

        for(int i=0 ; i<size ; i++){
            int val = num.charAt(i) - '0' ;
            frequency.put(val , frequency.getOrDefault(val , 0) + 1) ;
        }

        for(int i=0 ; i<size ; i++){
            int val = num.charAt(i) - '0' ;
            if(val != frequency.getOrDefault(i , 0)) return false;
        }

        return true ;
    }
}