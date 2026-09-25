class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPair = 0 ;
        HashMap<Integer , Integer> freq = new HashMap<>() ;

        for(int i=0 ; i<nums.length ; i++){
            freq.put(nums[i] , freq.getOrDefault(nums[i] , 0) + 1) ;
        }

        for(int val : freq.values()){
            int pairs = (val * (val-1) / 2) ;
            goodPair += pairs ;
        }

        return goodPair ;
    }
}