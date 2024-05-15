import java.util.*;

public class LargestNumber{
    public static int getLargest(int numbers[]){
        int Largest = Integer.MIN_VALUE; // Gives -infinity
        int Smallest = Integer.MAX_VALUE; // Gives +infinity

        for(int i=0; i<numbers.length; i++){
            if(Largest < numbers[i]){
                Largest = numbers[i];
            }

            if(Smallest > numbers[i]){
                Smallest = numbers[i];
            }
        }

        System.out.println("The Smallest number in the given array is : " + Smallest);
        return Largest;

    }
    public static void main(String args[]){
        int numbers[] = {1, 3, 4, 5, 7, 2, 6};

        int LargestNum = getLargest(numbers);
        System.out.println("The largest number in the given array is : " + LargestNum);

    }
}