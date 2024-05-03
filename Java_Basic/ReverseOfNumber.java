// Print Reverse of a numebr 


public class ReverseOfNumber{
    public static void main(String args[]){
        int n = 60804;
        // // Logic - To get the last digit of number we divide it by 10 and the remainder is the last digit
        // // Last digit - num % 2
        // // Remove last dig num / 10
        
        // while(n>0){
        //     int lastDigit = n % 10;
        //     System.out.print(lastDigit + " ");
        //     n = n / 10; 
        // }



        // Reverse the given number
        int rev = 0;

        while(n>0){
            int lastDigit = n % 10;
            rev = (rev*10) + lastDigit;
            n = n / 10; 
        }

        System.out.print(rev);



    }
}