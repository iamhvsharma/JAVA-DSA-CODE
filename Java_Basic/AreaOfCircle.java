// Write a program to find Area of Circle

import java.util.*;

public class AreaOfCircle {
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area); 
    }
}


// NOTE - In java if we doesn't specify the type of decimal number as double or float then It automatically considers the decimal value as Double so we need to write decimal nuber as "3.14f"
// f denotes float here