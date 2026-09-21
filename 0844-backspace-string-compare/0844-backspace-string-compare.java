class Solution {
    public boolean backspaceCompare(String s, String t) {

        StringBuilder tempS = new StringBuilder();
        StringBuilder tempT = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) != '#') {
                tempS.append(s.charAt(i));
            }
            else if(tempS.length() > 0) {
                tempS.deleteCharAt(tempS.length() - 1);
            }
        }

        for(int i = 0; i < t.length(); i++) {

            if(t.charAt(i) != '#') {
                tempT.append(t.charAt(i));
            }
            else if(tempT.length() > 0) {
                tempT.deleteCharAt(tempT.length() - 1);
            }
        }

        return tempS.toString().equals(tempT.toString());
    }
}