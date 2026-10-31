class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int size = people.length;
        int boats = 0;

        int low = 0;
        int high = size-1;
        
        while(low <= high){
            int totalWeight = people[low] + people[high];

            if(totalWeight <= limit){
                low++;
                high--;
            }
            else{
                high--;
            }
            boats++;
        }
        return boats;
    }
}