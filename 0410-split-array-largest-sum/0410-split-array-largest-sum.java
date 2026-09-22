class Solution {

    public boolean isValidAnswer(int[] nums , int k , long sum){
        long currentSum = 0;
        int subArrayCount = 1 ;

        for(int val : nums){
            if((currentSum + val) <= sum){
                currentSum += val ;
            }
            else{

                subArrayCount++ ;
                if((val > sum) || subArrayCount > k){
                    return false ;
                }
                currentSum = val ;
            }
        }

        return true ;
    }

    public int splitArray(int[] nums, int k) {
        
        int sum = 0 ;
        for(int val : nums){
            sum += val ;
        }

        long low = 0 , high = sum ;
        int ans = 0 ;

        while(low <= high){
            long mid = low + (high-low)/2 ;

            if(isValidAnswer(nums , k , mid)){
                ans = (int)mid ;
                high = mid-1 ;
            }
            else{
                low = mid+1 ;
            }

        }

        return ans ;
    }
}