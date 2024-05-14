import java.util.*;
public class Ques1{



    public static void calculateAverage(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a + b + c)/3;
        System.out.println("Average is : " + average);
    }

    public static void main(String args[]){
        calculateAverage();
    
} 
}