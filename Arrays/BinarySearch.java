import java.util.*;

public class BinarySearch{
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;
        while(start <= end){
            int mid = (start + end)/2;

            // Comparisions 
            if(numbers[mid] == key){
                return mid;
            } if(numbers[mid] < key){ // Right case
                start = mid+1;
                
            } else {// Left case
            end = mid-1;


            }
        }

        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {2, 3, 4, 6, 7, 8, 9, 12, 14, 15};
        int key = 3;
        System.out.println("Index for key is: " + binarySearch(numbers, key));

    }
}