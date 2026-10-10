class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0 ;
        long size = nums.length ;

        for(int i=0 ; i<size ; i++){

            if(nums[i] == 0){
                long countZero = 1 ;
                
                while(i<size-1 && (nums[i] == nums[i+1])){
                    countZero++ ;
                    i++ ;
                }

                ans += (long)((countZero * (countZero+1)) / 2) ;
            }

        }

        return ans ;
    }
}