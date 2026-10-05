class Solution {
    public boolean divisorGame(int n) {
        int moves = 0 ;

        while(n > 1){

            for(int i=1 ; i<=n/2 ; i++){
                if(n%i == 0){
                    n -= i ;
                    moves++ ;
                    break ;
                }
            }
        }

        if((moves&1) == 1) return true ;
        return false ; 
    }
}