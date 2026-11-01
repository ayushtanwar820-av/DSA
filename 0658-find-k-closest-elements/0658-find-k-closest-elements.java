class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int size = arr.length;
        int low = 0;
        int high = size-1;
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

        if(low == 0){
            for(int i=0 ; i<k ; i++){
                result.add(arr[i]);
            }
        }
        else if(low == size){
            for(int i=0 ; i<k ; i++){
                low--;
                result.add(arr[low]);
            }
        }
        else{
            int left = low-1;
            int right = low;

            for(int i=0 ; i<k ; i++){

                int leftDiff = Integer.MAX_VALUE;
                int rightDiff = Integer.MAX_VALUE;

                if(left >= 0){
                    leftDiff = Math.abs(x - arr[left]);
                }
                if(right < size){
                    rightDiff = Math.abs(x - arr[right]);
                }

                if(leftDiff > rightDiff){
                    result.add(arr[right]);
                    right++;
                }
                else{
                    result.add(arr[left]);
                    left--;
                }
            }
        }
        Collections.sort(result);
        return result;
    }
}