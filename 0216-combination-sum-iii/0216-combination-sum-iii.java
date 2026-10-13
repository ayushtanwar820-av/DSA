class Solution {

    public void validCombinations(int k , int target , int num , List<List<Integer>> result , List<Integer> current){
        if((k == 0) && (target == 0)){
            result.add(new ArrayList<>(current)) ;
            return ;
        }
        if(target < 0) return ;
        if(num > 9) return ;

        current.add(num) ;
        validCombinations(k-1 , target-num , num+1 , result , current) ;

        current.remove(current.size()-1) ;
        validCombinations(k , target , num+1 , result , current) ;
    } 

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>() ;
        validCombinations(k , n , 1 , result , new ArrayList<>()) ;

        return result ;
    }
}