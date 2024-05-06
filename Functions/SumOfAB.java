// Sum of a and b using functions

import java.util.*;

public class SumOfAB{
    public static void calculateSum(){
        Scanner sc = new Scanner(System.i n);
        System.out.print("Enter a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is : " + sum);
    }

    public static void main(String args[]){
        calculateSum();
    }
}