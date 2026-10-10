class Solution {
    public List<Integer> findLonely(int[] nums) {

        List<Integer> lonely = new ArrayList<>() ;
        HashMap<Integer , Integer> freq = new HashMap<>() ;
        int size = nums.length ;

        for(int i=0 ; i<size ; i++){
            freq.put(nums[i] , freq.getOrDefault(nums[i] , 0) + 1) ;
        }

        for(int i=0 ; i<size ; i++){
            int current = nums[i] ;

            int currFreq = freq.get(current) ;
            int currPlusOneFreq = freq.getOrDefault(current+1 , 0) ;
            int currMinusOneFreq = freq.getOrDefault(current-1 , 0) ;

            if((currFreq == 1) && (currMinusOneFreq == 0) && (currPlusOneFreq == 0)) lonely.add(current) ;
        }

        return lonely ;
    }
}