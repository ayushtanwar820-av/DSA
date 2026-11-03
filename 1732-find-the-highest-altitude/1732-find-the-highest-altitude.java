class Solution {
    public int largestAltitude(int[] gain) {
        int size = gain.length;
        int highestAltitude = 0;
        int currAltitude = 0;

        for(int i=0 ; i<size ; i++){
            currAltitude += gain[i];
            highestAltitude = Math.max(highestAltitude, currAltitude);
        }

        return highestAltitude;
    }
}