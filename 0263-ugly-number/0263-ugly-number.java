class Solution {
    public boolean isUgly(int n) {
        int[] factor = {2,3,5};

        if(n <= 0) return false;

        for(int i=0 ; i<=2 ; i++){
            int temp = factor[i];

            while(n%temp == 0){
                n = n/temp;
            }
        }

        if(n == 1) return true;
        return false;
    }
}