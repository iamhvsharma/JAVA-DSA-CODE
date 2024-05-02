// Question1: In a program, input 3 numbers: A, B and C. You have to output the average of these 3 numbers. (Hint : Average of N numbers is sum of those numbers divided by N)

import java.util.*;

public class Question1{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = sc.nextInt();
        System.out.print("Enter A : ");
        int b = sc.nextInt();
        System.out.print("Enter A : ");
        int c = sc.nextInt();

        int average = (a + b + c)/3;
        System.out.println("Average of A, B and C is : " + average);

    }
}


