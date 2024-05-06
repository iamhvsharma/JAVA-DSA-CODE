import java.util.*;

public class ProductOfAB{
    public static void calProduct(int a, int b){
        int product = a * b;
        System.out.println("Product is : " + product);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        calProduct(x, y);
    }
}