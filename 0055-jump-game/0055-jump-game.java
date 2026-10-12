class Solution {
    public boolean canJump(int[] nums) {
        int maxDistance = Integer.MIN_VALUE ;

        for(int i=0 ; i<nums.length ; i++){

            if(i == nums.length-1) return true ;

            if(nums[i] > maxDistance){
                maxDistance = nums[i] ;
            }
            maxDistance-- ;

            if(maxDistance < 0) return false ;
        }

        return false ;
        
    }
}