class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0 ;

        for(int i=left ; i<=right ; i++){
            int setBits = 0 ;
            int temp = i ;
            while(temp > 0){
                temp = temp&(temp-1) ;
                setBits++ ;
            }

            boolean flag = true ;

            if(setBits <= 1){
                flag = false ;
            }
            else{
                flag = true ;
            }

            for(int j=2 ; j*j <= setBits ; j++){
                if(setBits%j == 0){
                    flag = false ;
                    break ;
                }
            }

            if(flag) count++ ;
        }

        return count ;
    }
}