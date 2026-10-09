class Solution {

    public int gcd(int n , int m){
        
        while(m != 0){
            int remainder = n%m ;
            n = m ;
            m = remainder ;
        }

        return n ;
    }

    public long maxPairStrength(int[] nums) {
        long maxStrength = 0 ;
        int end = nums.length-1 ;
        Arrays.sort(nums) ;

        for(int i=end ; i>0 ; i--){
            for(int j=i-1 ; j>=0 ; j--){
                
                long product = (long)nums[i] * nums[j] ;
                if(product <= maxStrength) break ;

                int hcf = gcd(nums[i] , nums[j]) ;
                if(hcf == 0) continue ;

                long currentStrength = (long)(nums[i] / hcf) * (nums[j] / hcf) ;

                if(currentStrength > maxStrength) maxStrength = currentStrength ;
            }
        }

        return maxStrength ;
    }
}