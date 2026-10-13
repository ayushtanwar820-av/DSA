class Solution {

    public void subsetSumsTarget(int[] candidates , int target , List<Integer> current , List<List<Integer>> result , int idx){

        if(idx >= candidates.length){
            if(target == 0){
                result.add(new ArrayList<>(current)) ;
            }
            return ;
        }
        if(target < 0) return ;

        current.add(candidates[idx]) ;
        subsetSumsTarget(candidates , target-candidates[idx] , current , result , idx+1) ;

        int next = idx+1 ;
        while((next<candidates.length) && (candidates[next]==candidates[idx])){
            next++ ;
        }
        current.remove(current.size()-1) ;
        subsetSumsTarget(candidates , target , current , result , next) ;
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates) ;
        List<List<Integer>> result = new ArrayList<>() ; 
        subsetSumsTarget(candidates , target , new ArrayList<>() , result , 0) ;

        return result ;
    }
}