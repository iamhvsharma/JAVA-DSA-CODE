 import java.util.*;

public class PrintSubArray{
    public static void PrintSubArray(int numbers[]){
        int TotalSubArray = 0;
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                for(int k = start; k<=end; k++){
                    System.out.print(numbers[k]+ " "); // Subarray 
                }
                TotalSubArray++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("The total number of subarray are : " + TotalSubArray);
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 5, 6, 7, 8};
        PrintSubArray(numbers);

    }
}