class Solution {
    public int singleNonDuplicate(int[] nums) {
        int size = nums.length ;
        int low = 0 ;
        int high = size-1 ;

        while(low <= high){
            int mid = low + (high-low)/2 ;

            if((mid-1)>=0 &&(nums[mid] == nums[mid-1]) && (mid&1)==0){
                high = mid-2 ;
            }
            else if((mid+1)<size && (nums[mid] == nums[mid+1]) && ((mid+1)&1)==0){
                high = mid-1 ;
            }
            else if((mid-1)>=0 && (nums[mid] == nums[mid-1]) && ((mid)&1)==1){
                low = mid+1 ;
            }
            else if((mid+1)<size && (nums[mid] == nums[mid+1]) && ((mid+1)&1)==1){
                low = mid+2 ;
            }
            else{
                return nums[mid] ;
            }
        }

        return -1 ;
    }
}