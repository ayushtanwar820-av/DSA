class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int size = nums.length ;
        int i=0 , j=1 ;

        while(j < size){
            if(((i&1) == 0 && (nums[i]&1) == 0) || ((i&1) == 1 && (nums[i]&1) == 1)){
                i++ ;
                j++ ;
            }
            else{
                if(((nums[i]&1) == 0) && ((nums[j]&1) == 1)){
                    int temp = nums[i] ;
                    nums[i] = nums[j] ;
                    nums[j] = temp ;
                    i++ ;
                }
                else if(((nums[i]&1) == 1) && ((nums[j]&1) == 0)){
                    int temp = nums[i] ;
                    nums[i] = nums[j] ;
                    nums[j] = temp ;
                    i++ ;
                }
                else{
                    j++ ;
                }
            }
        }
        return nums ;
    }
}