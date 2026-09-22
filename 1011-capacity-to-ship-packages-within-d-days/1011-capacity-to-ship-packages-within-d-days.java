class Solution {

    public boolean isValidAnswer(int[] weights , int days , long capacity){
        int size = weights.length ;
        int dayCount = 1 ;
        int load = 0 ;

        for(int i=0 ; i<size ; i++){

            if(capacity < weights[i]) return false ;

            if((load + weights[i] <= capacity)){
                load += weights[i] ;
            }
            else{
                dayCount++ ;
                load = weights[i] ;
            }
        }

        return dayCount <= days ;
    }

    public int shipWithinDays(int[] weights, int days) {
        long sum = 0 ;

        for(int val : weights){
            sum += val ;
        }

        long start = 1 , end = sum ;
        int ans = -1 ;

        while(start <= end){
            long mid = start + (end-start)/2 ;

            if(isValidAnswer(weights , days , mid)){
                ans = (int)mid ;
                end = mid-1 ;
            }
            else{
                start = mid+1 ;
            }

        }

        return ans ;
    }
}