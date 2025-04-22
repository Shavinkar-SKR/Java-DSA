package recursion;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99,100};
        int left = 0;
        int target = 100;
        int right = arr.length-1;

        System.out.println(search(arr, target, left, right));
    }

    static int search(int[] arr, int target, int left, int right){

        if(left>right){
            return -1;
        }

        int index = (left+right)/2;
        if(arr[index] == target){
            return index;
        }

        if(target<arr[index]){
            return search(arr ,target, left, index-1);
        }

        return search(arr ,target, index+1, right);

    }
}
