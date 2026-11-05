class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int size = nums.length;
        int maxSum = Integer.MIN_VALUE; 

        for(int i=0 ; i<=size-k ; i++){
            int currSum = 0;
            for(int j=i ; j<i+k ; j++){
                currSum += nums[j];
            }

            maxSum = Math.max(currSum, maxSum);
        }

        double maxAvg = (double)maxSum/k;
        return maxAvg;
    }
}