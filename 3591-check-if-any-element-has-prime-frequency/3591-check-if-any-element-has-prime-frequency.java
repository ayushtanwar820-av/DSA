class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer , Integer> frequency = new HashMap<>() ;

        for(int val : nums){
            frequency.put(val , frequency.getOrDefault(val , 0) + 1) ;
        }

        for(int num : frequency.values()){
            boolean isPrime = true ;
            for(int i=2 ; i*i<=num ; i++){
                if(num%i == 0){
                    isPrime = false ;
                    break ;
                }
            }
            if(isPrime && num != 1) return true ;
        }

        return false ;
    }
}