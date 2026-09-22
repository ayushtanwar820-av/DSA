class Solution {

    public boolean isValidAnswer(int[] candies , long k , long maxCandies){

        int size = candies.length ;
        long child = 0 ;
        
        for(int i=0 ; i<size ; i++){
            if(candies[i]/maxCandies > 0){
                child += candies[i]/maxCandies ;
            }
        }

        if(child >= k) return true ;
        return false ;

    }

    public int maximumCandies(int[] candies, long k) {
        
        int size = candies.length ;
        int max = Integer.MIN_VALUE ;

        for(int val : candies){
            if(val > max){
                max = val ;
            }
        }

        long start = 1 , end = max ;
        int ans = 0 ;
 
        while(start <= end){
            long mid = start + (end-start)/2 ;

            if(isValidAnswer(candies , k , mid)){
                ans = (int)mid ;
                start = mid+1 ;
            }
            else{
                end = mid-1 ;
            }

        }

        return ans ;
    }
}