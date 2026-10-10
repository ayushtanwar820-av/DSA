class Solution {

    public void powerSet(int[] nums , List<List<Integer>> result , int idx , HashSet<Integer> temp){
        if(idx < 0){
            List<Integer> output = new ArrayList<>(temp) ;
            result.add(output) ;
            return ;
        }

        temp.add(nums[idx]) ;
        powerSet(nums , result , idx-1 , temp) ;

        temp.remove(nums[idx]) ;
        powerSet(nums , result , idx-1 , temp) ;
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>() ;
        HashSet<Integer> temp = new HashSet<>() ;

        powerSet(nums , result , nums.length-1 , temp) ;
        return result ;
    }
}