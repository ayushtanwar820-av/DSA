class Solution {
    public int subarraySum(int[] nums, int k) {
        int size = nums.length;
        HashMap<Integer,Integer> prefixSum = new HashMap<>();
        int count = 0;
        int sum = 0;

        prefixSum.put(0, 1);
        for(int i=0 ; i<size ; i++){

            sum += nums[i];

            int required = sum - k;

            if(prefixSum.containsKey(required)){
                count += prefixSum.get(required);
            }

            prefixSum.put(sum, prefixSum.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}