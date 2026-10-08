class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> result = new ArrayList<>() ;
        Set<Integer> players = new HashSet<>() ;
        HashMap<Integer , Integer> lossCount = new HashMap<>() ;

        for(int[] match : matches){

            int winner = match[0] ;
            int loser = match[1] ;

            players.add(winner) ;
            players.add(loser) ;

            lossCount.put(loser , lossCount.getOrDefault(loser , 0) + 1) ;
        }

        List<Integer> zeroLoss = new ArrayList<>() ;
        List<Integer> oneLoss = new ArrayList<>() ;

        for(int player : players){

            int loss = lossCount.getOrDefault(player , 0) ;

            if(loss == 0){
                zeroLoss.add(player) ;
            }
            else if(loss == 1){
                oneLoss.add(player) ;
            }
        }

        Collections.sort(zeroLoss) ;
        Collections.sort(oneLoss) ;

        result.add(zeroLoss) ;
        result.add(oneLoss) ;

        return result ;
    }
}