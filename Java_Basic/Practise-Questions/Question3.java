//  Question 3 : Enter cost of 3 items from the user (using float data ),  a pencil, eraser, and pen you have to output the total cost of the items back the the user as bill
// Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.*;

public class Question3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost of Pen: ");
        int pen = sc.nextInt();
        System.out.print("Enter cost of Pencil: ");
        int pencil = sc.nextInt();
        System.out.print("Enter cost of Eraser: ");
        int eraser = sc.nextInt();

        int total = pen + pencil + eraser;

        System.out.println("Bill: " + total);
        System.out.println("Bill with GST is : " + (total + (total * 0.18)));
    }
}