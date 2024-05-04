// Check if a number is prime or not

// Optimised solution { PRIME : n = root n * root n} => The unique factors of n is found from 2 to root n

import java.util.*;

public class Question9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter a number : ");

        int n = sc.nextInt();
        if(n==2){
            System.out.println("Entered number is Prime");
        } else{
            boolean isPrime = true;
            for(int i = 2; i<= Math.sqrt(n); i++){
                if(n % i == 0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
            System.out.println("The entered number is Prime n = " + n);
        } else{
            System.out.println("The entered number is not Prime n = " + n);
        }
        }

        

    }
}