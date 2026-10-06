class Solution {
    public int compress(char[] chars) {
        StringBuilder s = new StringBuilder() ;
        int size = chars.length ;

        int i= 0 ;
        while(i < size){
            char currentCh = chars[i] ;
            s.append(currentCh) ;

            int j = i+1 ;
            while(j<size && (currentCh == chars[j])){
                j++ ;
            }

            int count = j - i ;
            if(count > 1) s.append(count) ;
            i = j ;

        }

        int strSize = s.length() ;
        for(int k=0 ; k<strSize ; k++){
            chars[k] = s.charAt(k) ;
        }

        return strSize ;
    }
}