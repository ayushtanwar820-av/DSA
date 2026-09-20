class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int size = nums.length ;
        int diff = Integer.MAX_VALUE ;
        int ans = 0 ; 
        Arrays.sort(nums) ;
        
        for(int i=0 ; i<size-2 ; i++){
            int firstNum = nums[i] ;
            int remainingTarget = target - firstNum ;
            int low = i+1 ;
            int high = size-1 ;

            while(low < high){
                int sum = nums[low] + nums[high] ;

                if(sum == remainingTarget){
                    return target ;
                }

                int currentDiff = Math.abs(remainingTarget - sum) ;
                if(diff > currentDiff){
                    ans = firstNum + sum ;
                    diff = currentDiff ;
                }
                
                if(sum > remainingTarget){
                    high-- ;
                }
                else{
                    low++ ;
                }
            }
        }
        return ans ;
    }
}