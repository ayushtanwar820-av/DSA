class Solution {

    public boolean isValidAnswer(int[] nums , int thresould , long divisor){

        int result = 0 ;

        for(int val : nums){
            if(val%divisor == 0){
                result += val/divisor ;
            }
            else{
                result += val/divisor + 1 ;
            }
        }

        if(result <= thresould) return true ;
        return false ;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        
        int max = Integer.MIN_VALUE ;

        for(int val : nums){
            if(val > max){
                max = val ;
            }
        }

        long low = 1 , high = max ;
        int ans = 1 ;

        while(low <= high){
            long mid = low + (high-low)/2 ;

            if(isValidAnswer(nums , threshold , mid)){
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