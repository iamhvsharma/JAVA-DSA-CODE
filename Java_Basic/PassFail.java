import java.util.*;

public class PassFail{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // using ternary operator
        String result = (marks>=33) ? "Pass" : "Fail";
        System.out.println("You are Pass, Marks: " + marks);


        // if(marks>=33){
        //     System.out.println("You are pass, Marks = " + marks);
        // } else{
        //     System.out.println("You are pass, Marks = " + marks);
        // }
    }
}