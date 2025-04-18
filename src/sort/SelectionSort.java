package sort;

import java.util.ArrayList;

public class SelectionSort {

    public static void main(String[] args) {

        int[] nums = {91, 32, 92, 13, 73, 14};

        printArray(nums);
        for(int i = 0; i< nums.length; i++){
            int max=0;
            for(int j = 0; j < nums.length-i; j++){
                if( nums[max] < nums[j]){
                    max = j;
                }
            }

            int swap = nums[nums.length-1-i]; //14
            nums[nums.length-1-i] = nums[max]; //92
            nums[max] = swap; //14
        }
        printArray(nums);
    }

    public static void printArray(int[] arr){
        System.out.print("[ ");
        for(int num: arr){
            System.out.print(num);
            System.out.print(", ");
        }
        System.out.print("]");
        System.out.println("\n");
    }
}
