import java.util.*;

public class incomeTaxCal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Income: ");
        double income = sc.nextFloat();
        double tax;
        if(income < 500000){
            tax = 0;
            System.out.println("Tax amount = " + tax);
        }
        else if(income > 500000 && income < 1000000){
            tax = income * 0.2;
            System.out.println("Tax amount = " + tax);
        }
        else{
            tax = income * 0.3;
            System.out.println("Tax amount = " + tax);
        }

    


    }
}