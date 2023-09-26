// Type Casting in Java

import java.util.*;

public class TypeCasting {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            float a = 25.12f;
            // int b = a;
            // This will show error

            // To do explicit conversion we will write
            int b = (int) a;
            System.out.println(b);


            char ch = 'a';
            char ch2 = 'b';
            int number = ch;
            int number2 = ch2;
            System.out.println(number);
            System.out.println(number2);

            // The above characters code gives ASCII number
        
    }
}