import java.util.*;

public class TypePromotion {
    public static void main(String args[]) {
        char a = 'a';
        char b = 'b';
        System.out.println(b-a);
        System.out.println((int)a);
        System.out.println((int)b);

        int d = 10;
        float e = 25.34f;
    
        double f = 23;
        long g = 23;
        double ans =  (d + e + f);
        System.out.println(ans);


        // Type Promotion in Expression

        // Wrong 
        byte x = 5;
        byte y = (byte) (x * 2);

        System.out.println(y);


    }
}
