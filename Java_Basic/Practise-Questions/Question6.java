// Question - Write a program to input week number (1-7) and print day of week name using switch case

public class Question6{
    public static void main(String args[]){
        int day = 3;
        switch(day){
            case 1 : System.out.println("Sunday");
            break;
            case 2 : System.out.println("Monday");
            break;
            case 3 : System.out.println("Tuesday");
            break;
            case 4 : System.out.println("Wednesday");
            break;
            case 5 : System.out.println("Thrusday");
            break;
            case 6 : System.out.println("Firday");
            break;
            case 7 : System.out.println("Saturday");
            break;
        }
    }
}