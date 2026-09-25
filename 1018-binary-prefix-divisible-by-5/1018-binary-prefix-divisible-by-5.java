class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>() ;
        int x = 0 ;

        for(int i=0 ; i<nums.length ; i++){
            x = (2*x + nums[i]) % 5 ; // left shift + new bit

            result.add(x == 0) ;
        }

        return result ;
    }
}