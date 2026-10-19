class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums) ;
        int size = nums.length ;
        List<Integer> result = new ArrayList<>() ;

        for(int i=0 ; i<size ; i++){
            if(target == nums[i]){
                result.add(i) ;
            }
        }

        return result ;
    }
}