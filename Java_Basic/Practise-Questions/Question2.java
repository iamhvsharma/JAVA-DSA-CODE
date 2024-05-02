// Question 2 : In a program, input the side of a square. You have to output the area of the Square 

import java.util.*;

public class Question2{
    public static void main(String args[]){
        System.out.print("Enter the Side of Square : ");
        Scanner sc = new Scanner(System.in);

        float side = sc.nextFloat();

        float area = side * side;

        System.out.println("The are of square is : " + area);



    }
}