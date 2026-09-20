class Solution {
    public String reverseVowels(String s) {
        int size = s.length() ;
        int low = 0 ;
        int high = size-1 ;
        List<Character> vowel = new ArrayList<>() ;
        String ans = new String() ;

        for(int j=0 ; j<size ; j++){
            if(s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u' || s.charAt(j) == 'A' || s.charAt(j) == 'E' || s.charAt(j) == 'I' || s.charAt(j) == 'O' || s.charAt(j) == 'U'){
                vowel.add(s.charAt(j)) ;
            }
        }

        int totalVowel = vowel.size()-1 ;
        for(int i=0 ; i<size ; i++){
            if(totalVowel >= 0){
                char ch = vowel.get(totalVowel);

                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                    ans += ch ;
                    totalVowel-- ;
                }
                else{
                    ans += s.charAt(i) ;
                }
            }
            else{
                ans += s.charAt(i) ;
            }
        }
        return ans ;
    }
}