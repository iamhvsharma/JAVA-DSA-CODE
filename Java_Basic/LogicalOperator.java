public class LogicalOperator{
    public static void main(String args[]){
        int A = 10;
        int B = 15;

        System.out.println(A<B && A != B); // Logical AND
        System.out.println(A>B && A < B); // Logical AND


        System.out.println(A<B || A != B); // Logical AND ( T and F)
        System.out.println(A>B || A == B); // Logical AND (F and F)
        

        System.out.println(!(A>B)); // Logical NOT Gives True value while the condition is false


    }
}