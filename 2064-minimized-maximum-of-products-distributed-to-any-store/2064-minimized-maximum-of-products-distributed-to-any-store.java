class Solution {

    public boolean isValidAnswer(int[] quantities , int n , long noOfProduct){

        int size = quantities.length ;
        int shops = 0 ;
        int totalProduct = 0 ;

        for(int i=0 ; i<size ; i++){
            if(quantities[i]%noOfProduct == 0){
                shops += quantities[i]/noOfProduct ;
            }
            else{
                shops += (quantities[i]/noOfProduct) + 1 ;
            }
        }
        

        if(shops <= n) return true ;
        return false ;
    }

    public int minimizedMaximum(int n, int[] quantities) {
        
        int max= Integer.MIN_VALUE ;

        for(int val : quantities){
            if(val > max){
                max = val ;
            }
        }

        long low = 1 , high = max ;
        int ans = 1 ;

        while(low <= high){
            long mid = low + (high-low)/2 ;

            if(isValidAnswer(quantities , n , mid)){
                ans = (int)mid ;
                high = mid-1 ;
            }
            else{
                low = mid+1 ;
            }

        }
        return ans ;
    }
}