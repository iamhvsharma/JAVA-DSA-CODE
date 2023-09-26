// Write a program to take input of 2 numbers from the user and then find the product of both numbers

import java.util.*;

public class ProductInput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;
        System.out.println(product);
    }
}