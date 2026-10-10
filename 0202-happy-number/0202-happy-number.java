class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>() ;

        while(n != 1){
            if(seen.contains(n)) return false ;

            int digitSqrSum = 0 ;
            seen.add(n) ;

            while(n > 0){
                int digit = n%10 ;
                n = n/10 ;
                digitSqrSum += (digit*digit) ;
            }

            n = digitSqrSum ;
            
        }

        return true ;
    }
}