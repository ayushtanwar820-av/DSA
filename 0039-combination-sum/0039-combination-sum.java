class Solution {

    public void subsetSumsTarget(int[] candidates , int target , List<Integer> current , List<List<Integer>> result , int idx){

        int sum = 0 ;
        for(int val : current){
            sum += val ;
        }

        if(idx >= candidates.length){
            if(target == sum){
                result.add(new ArrayList<>(current)) ;
            }
            return ;
        }
        if(sum > target) return ;

        current.add(candidates[idx]) ;
        subsetSumsTarget(candidates , target , current , result , idx) ;

        current.remove(current.size()-1) ;
        subsetSumsTarget(candidates , target , current , result , idx+1) ;
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>() ;
        subsetSumsTarget(candidates , target , new ArrayList<>() , result , 0) ;

        return result ;
    }
}