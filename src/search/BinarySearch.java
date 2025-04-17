package search;

public class BinarySearch {

    public static void usingForLoop(){
        int[] numbers = {11,17,18,45,50,71,95};
        int searchValue = 17;

        int low=0, mid=(numbers.length)/2, high=numbers.length-1;

        if(searchValue<numbers[mid]){
            high=mid-1;
        }else{
            low=mid+1;
        }


        for (int i = 0; i < numbers.length; i++) {

        }


    }
}
