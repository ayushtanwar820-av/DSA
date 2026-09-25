class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>() ;

        for(int i=left ; i<=right ; i++){
            int temp = i ;
            boolean flag = true ;

            while(temp > 0){
                int digit = temp%10 ;
                if((digit == 0) || (i%digit != 0)){
                    flag = false ;
                    break ;
                }

                temp /= 10 ;
            }

            if(flag) result.add(i) ;
        }

        return result ;
    }
}