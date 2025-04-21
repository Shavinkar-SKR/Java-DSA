package recursion;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int left = 0;
        int target = 9;
        int right = arr.length-1;

        System.out.println(search(arr, target, left, right));
    }

    static int search(int[] arr, int target, int left, int right){

        if(left>right){
            return -1;
        }

        int index = left + (right - left)/2;
        if(arr[index] == target){
            return target;
        }

        if(target<arr[index]){
            return search(arr ,target, left, index-1);
        }

        return search(arr ,target, index+1, right);

    }
}
