class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0 ;
        int size = nums.size() ;

        Collections.sort(nums) ;
        
        int left = 0 , right = size-1 ;

        while(left < right){
            int sum = nums.get(left) + nums.get(right) ;

            if(target > sum){
                count += (right - left) ;
                left++ ;
            }
            else{
                right-- ;
            }

        }

        return count ;
    }
}