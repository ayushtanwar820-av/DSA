class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int size = nums.length;
        int sum = 0;

        for(int i=0 ; i<size ; i++){
            int index1 = i-k;
            int index2 = i+k;

            if(!isValidIndex(nums, index1) && !isValidIndex(nums, index2)){
                sum += nums[i];
            }
            else if(isValidIndex(nums, index1) && isValidIndex(nums, index2)){
                if((nums[i] > nums[index1]) && (nums[i] > nums[index2])){
                    sum += nums[i];
                }
            }
            else if(!isValidIndex(nums, index1)){
                if(nums[i] > nums[index2]) sum += nums[i];
            }
            else{
                if(nums[i] > nums[index1]) sum += nums[i];
            }
        }

        return sum;
    }

    public boolean isValidIndex(int[] nums, int i){
        if(i>=0 && i<nums.length) return true;
        return false;
    }
}