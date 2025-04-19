package search;

public class LinearSearch {

    public static int usingWhileLoop(int[] numbers, int findMe){
        int i=0;
        while(findMe!=numbers[i]){
            i++;
        }
        return i;
    }

    public static int usingForLoop(int[] nums, int findMe){
        for(int i=0; i<nums.length; i++){
            if(nums[i]==findMe){
                return i;
            }
        }return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,6,9,3,1,5,2,8};
        int searchValue = 1;
        System.out.println("Found using WHILE LOOP: "+usingWhileLoop(nums, searchValue));

        System.out.println("Found using FOR LOOP: "+usingForLoop(nums, searchValue));
    }
}
