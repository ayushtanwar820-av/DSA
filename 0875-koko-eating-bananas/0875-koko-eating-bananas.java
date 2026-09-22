class Solution {

    public boolean isValidAnswer(int[] piles , int h , long speed){
        int size = piles.length ;
        long hrs = 0 ;

        for(int i=0 ; i<size ; i++){
            if(piles[i]%speed == 0){
                hrs += (piles[i]/speed) ;
            }
            else{
                hrs += ((piles[i]/speed) + 1) ;
            }
        }

        if(hrs <= h) return true ;
        return false ;
    }

    public int minEatingSpeed(int[] piles, int h) {
        long max = Integer.MIN_VALUE ;
        long ans = -1 ;

        for(int val : piles){
            if(val > max){
                max = val ;
            }
        }

        long start = 1 , end = max ;

        while(start <= end){

            long mid = start + (end-start)/2 ;

            if(isValidAnswer(piles , h , mid)){
                ans = mid ;
                end = mid-1 ;
            }
            else{
                start = mid+1 ;
            }

        }

        return (int)ans ;
    }
}