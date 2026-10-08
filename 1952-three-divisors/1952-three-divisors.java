class Solution {
    public boolean isThree(int n) {
        if(n <= 2) return false ;

        for(int i=2 ; i*i<=n ; i++){
            if(i*i == n) return true;
            else if(n%i == 0) return false ;
        }

        return false ;
    }
}