class Solution {

    public boolean found(int[] nums , int val , int idx){

        for(int i=0 ; i<nums.length ; i++){

            if(i == idx) continue ;
            if(nums[i] == val) return true ;

        }

        return false ;
    }

    public int largestInteger(int[] nums, int k) {

        int size = nums.length ;
        
        if(k == 1){
            int[] freq = new int[51] ;
            int maxi = -1 ;

            for(int num : nums){
                freq[num]++ ;
            }

            for(int num : nums){
                if(freq[num] == 1){
                    maxi = Math.max(num , maxi) ;
                }
            }

            return maxi ;
        }
        else if(k == size){

            int maxi = nums[0] ;
            for(int i=1 ; i<size ; i++){
                maxi = Math.max(maxi , nums[i]) ;
            }

            return maxi ;
        }

        int ans = -1 ;
        int first = nums[0] ;
        int last = nums[size-1] ;

        if(!found(nums , first , 0)){
            ans = Math.max(ans , first) ;
        }
        if(!found(nums , last , size-1)){
            ans = Math.max(ans , last) ;
        }

        return ans ;
    }
}