package sort;

public class BubbleSort {

    public static void main(String[] args) {

        int[] nums = {91, 32, 92, 13, 73, 14};
        int swap=0;
        printArray(nums);
        for (int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length-1-i; j++){
                if(nums[j]>nums[j+1]){
                    swap = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = swap;
                }
                printArray(nums);
            }
            printArray(nums);

        }
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for(int num: arr){
            System.out.print(num);
            System.out.print(", ");
        }
        System.out.print("]");
        System.out.println("\n");
    }
}
