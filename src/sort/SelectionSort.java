package sort;

import java.util.ArrayList;

public class SelectionSort {

    public static void main(String[] args) {

        int[] nums = {91, 32, 92, 13, 73, 14};
        int max=0, swap=0;

        for (int i = 0; i < nums.length; i++) {
            for(int j=1; j< nums.length-1-i; j++){
                if(nums[i]< nums[j]){
                    max = nums[j];
                }else{
                    max = nums[i];
                }
            }
            swap = nums[nums.length-1];
            nums[nums.length-1] = max;
        }

    }
}
