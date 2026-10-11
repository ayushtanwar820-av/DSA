class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>() ;
        List<Integer> arr2 = new ArrayList<>() ;
        int size = nums.length ;
        
        arr1.add(nums[0]) ;
        arr2.add(nums[1]) ;

        for(int i=2 ; i<size ; i++){
            int lastInArr1 = arr1.get(arr1.size()-1) ;
            int lastInArr2 = arr2.get(arr2.size()-1) ;

            if(lastInArr1 > lastInArr2){
                arr1.add(nums[i]) ;
            }
            else{
                arr2.add(nums[i]) ;
            }

        }

        int k=0 ;
        for(int i=0 ; i<arr1.size() ; i++){
            nums[k] = arr1.get(i) ;
            k++ ;
        }
        
        for(int i=0 ; i<arr2.size() ; i++){
            nums[k] = arr2.get(i) ;
            k++ ;
        }

        return nums ;
    }
}