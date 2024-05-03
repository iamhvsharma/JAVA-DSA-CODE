// Question : Write a program to get a number from user and print wheather it is Positive or negative

import java.util.*;

public class Question4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num < 0){
            System.out.println("The given number is Negative");

        } else {
            System.out.println("The given number is Positive");

        }
    }
}