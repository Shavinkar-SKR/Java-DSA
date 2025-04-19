package sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {1,2,5,8,9    ,3,4,6,7};
        int mid = nums.length/2;
        int[] arr1 = new int[mid];
        //int[] arr2 = new int[nums.length-mid];

        for (int i = 0; i <= mid; i++) {

            for(int j =mid+1; j< nums.length; j++){
                //
                if(nums[i]<nums[j]){
                    arr1[i] = nums[i];
                    break;
                }else{
                    arr1[i] = nums[j];

                }
            }
        }
    }
}
