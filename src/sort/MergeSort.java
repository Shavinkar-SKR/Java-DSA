package sort;

public class MergeSort {

    public static void merge(int[] list, int left, int mid, int right){
        //Create temp arrays
        //Copy data to temp arrays
        //Merge temp arrays
        //Copy remaining elements of leftArray[] if any
        //Copy remaining elements of rightArray[] if any
    }

    public static void sort(int[] list, int left, int right){
        if(left < right){
            int mid = (left+right)/2;
            sort(list, left, mid);
            sort(list, mid+1, right);
            merge(list, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,8,9    ,3,4,6,7};
        sort(nums, 0, nums.length-1);
//        int mid = nums.length/2;
//        int[] arr1 = new int[mid];
//        //int[] arr2 = new int[nums.length-mid];
//
//        for (int i = 0; i <= mid; i++) {
//
//            for(int j =mid+1; j< nums.length; j++){
//                //
//                if(nums[i]<nums[j]){
//                    arr1[i] = nums[i];
//                    break;
//                }else{
//                    arr1[i] = nums[j];
//
//                }
//            }
//        }
    }
}
