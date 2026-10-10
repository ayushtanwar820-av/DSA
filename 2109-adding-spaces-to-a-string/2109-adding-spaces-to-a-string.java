class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder temp = new StringBuilder(s) ;
        int size = spaces.length ;

        for(int i=0 ; i<size ; i++){

            int idx = spaces[i]+i ;
            temp.insert(idx , " ") ;
        }

        return temp.toString() ;
    }
}