class Solution {
    public int singleNonDuplicate(int[] nums) {
        int size = nums.length ;
        int low = 0 ;
        int high = size-1 ;

        while(low <= high){
            int mid = low + (high-low)/2 ;

            int currentVal = nums[mid] ;

            int prevVal = -1 ;
            if(mid-1 >= 0){
                prevVal = nums[mid-1] ;
            }
            
            int nextVal = -1 ;
            if(mid+1 < size){
                nextVal = nums[mid+1] ;
            }

            if((currentVal != prevVal) && (currentVal != nextVal)){
                return currentVal ;
            }
            else if(currentVal == prevVal){
                int currentLength = mid+1 ;

                if((currentLength&1) == 1){
                    high = mid-2 ;
                }
                else{
                    low = mid+1 ;
                }
            }
            else {
                int currentLength = (mid+1)+1 ;

                if((currentLength&1) == 1){
                    high = mid-1 ;
                }
                else{
                    low = mid+2 ;
                }
            }
        }

        return -1 ;
    }
}