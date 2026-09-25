class Solution {
    public boolean hasAlternatingBits(int n) {
        
        while(n > 0){
            int lastBit = n%2 ;
            int secondLastBit = (n/2)%2 ;

            if(lastBit == secondLastBit) return false ;

            n /= 2 ;
        }

        return true ;
    }
}