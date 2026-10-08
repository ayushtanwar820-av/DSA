class Solution {
    public int addDigits(int num) {
        if(num == 0) return 0 ;
        int sum = num ;

        while(num/10 != 0){
            sum = 0 ;
            int n = num ;

            while(n != 0){
                int digit = n%10 ;
                n /= 10 ;
                sum += digit ;
            }

            num = sum ;
        }

        return sum ;
    }
}