class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int size = arr.length;
        int low = 0;
        int high = size;

        List<Integer> result = new ArrayList<>();

        while(low < high){
            int mid = low + (high - low)/2;

            if(arr[mid] > x){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }

        int left = low-1;
        int right = low;

        for(int i=1 ; i<=k ; i++){

            if(left < 0){
                left = -1;
                right = k;
                break;
            }
            else if(right >= size){
                right = size;
                left = size-k-1;
                break;
            }

            int leftDiff = Math.abs(x - arr[left]);
            int rightDiff = Math.abs(x - arr[right]);

            if(leftDiff > rightDiff){
                right++;
            }
            else{
                left--;
            }
        }
        
        for(int i=left+1 ; i<right ; i++){
            result.add(arr[i]);
        }
        return result;
    }
}