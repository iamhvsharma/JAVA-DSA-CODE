// Question: Print the below pattern

// *
// **
// ***
// ****

public class Question1{
    public static void main(String args[]){
        for(int line = 1; line<=4; line++){
            for(int i = 1; i <=line; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}