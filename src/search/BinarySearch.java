package search;

public class BinarySearch {

    public static void main(String[] args){
        int[] numbers = {11,17,18,45,50,71,95};
        int searchValue = 50;

        int low=0, mid=(numbers.length)/2, high=numbers.length-1;

        while(low<=high && searchValue!=numbers[mid]){
            if(searchValue<numbers[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
            mid=(low+high)/2;
        }

        if (low>high){
            System.out.println("Value not found");
        }else{
            System.out.println("Value found at index: "+ mid);
        }



    }
}
