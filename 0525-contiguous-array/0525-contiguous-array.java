class Solution {
    public int findMaxLength(int[] nums) {
        int size = nums.length;
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for(int i=0 ; i<size ; i++){
            if(nums[i] == 0){
                sum--;
            }
            else{
                sum++;
            }

            if(map.containsKey(sum)){
                int currLen = i - map.get(sum);
                maxLen = Math.max(maxLen, currLen);
            }
            else{
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}