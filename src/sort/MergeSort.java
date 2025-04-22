package sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {4,6,2,3,8};
        nums = divide(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] divide(int[] arr){

        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = divide(Arrays.copyOfRange(arr, 0, mid));
        int[] right = divide(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right){
        //Create temp arrays
        //Copy data to temp arrays
        //Merge temp arrays
        //Copy remaining elements of leftArray[] if any
        //Copy remaining elements of rightArray[] if any

        int i = 0;
        int j = 0;
        int k = 0;
        int[] mix = new int[left.length + right.length];

        while(i<left.length && j< right.length){ //{1,2,5,8,9,3,4,6,7}
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while(i<left.length){
            mix[k] = left[i];
            i++;
            k++;
        }

        while(j<right.length){
            mix[k] = left[j];
            j++;
            k++;
        }

        return mix;
    }
}
