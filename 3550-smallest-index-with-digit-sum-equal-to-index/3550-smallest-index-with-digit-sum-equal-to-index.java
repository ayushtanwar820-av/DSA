class Solution {
    public int smallestIndex(int[] nums) {
        int size = nums.length ;

        for(int i=0 ; i<size ; i++){
            int n = nums[i] ;
            int sum = 0 ;

            while(n > 0){
                int digit = n%10 ;
                n = n/10 ;
                sum += digit ;
            }

            if(sum == i) return i ;
        }

        return -1 ;
    }
}