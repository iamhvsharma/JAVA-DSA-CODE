// Question : Keep Entering the number till use enters a multiple of 10 

import java.util.*;

public class Question7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            int n = sc.nextInt();
            if(n%10==0){
                System.out.println("The Entered number is multiple of 10 is : " + n);
                break;

            }
            System.out.println("Entered number is not multiple of 10: " + n);
        } while (true);
    }
}