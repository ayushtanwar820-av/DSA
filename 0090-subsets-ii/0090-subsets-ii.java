class Solution {

    public void subsets(int[] nums , HashSet<List<Integer>> result , int idx , List<Integer> output){
        if(idx < 0){
            List<Integer> temp = new ArrayList<>(output) ;
            Collections.sort(temp) ;
            result.add(temp) ;
            return ;
        }

        output.add(nums[idx]) ;
        subsets(nums , result , idx-1 , output) ; // Include

        output.remove(output.size() - 1) ;
        subsets(nums , result , idx-1 , output) ; //Exclude
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>() ;
        List<Integer> output = new ArrayList<>() ;

        subsets(nums , set , nums.length-1 , output) ;

        List<List<Integer>> result = new ArrayList<>(set) ;
        return result ;
    }
}