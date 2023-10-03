public class Operators {
    public static void main(String args[]) {
        int A = 10;
        int B = 5;
        System.out.println("Addition = "+ (A+B));
        System.out.println("Subtraction = "+ (A-B));
        System.out.println("Multiplication = "+ (A*B));
        System.out.println("Division = "+ (A/B));
        System.out.println("Modulo = "+ (A%B)); 

        // Increment Operator

        // Pre Increment  
        int x = 5;
        int y = ++x; 
        System.out.println(x);
        System.out.println(y);


        // Post Increment 
        int p = 10;
        int q = p++; // Post Increment 
        System.out.println(p);
        System.out.println(q);


        // Decrement Operator

        // Pre Decrement  
        int i = 5;
        int j = --i; 
        System.out.println(i);
        System.out.println(j);


        // Post Decrement 
        int k = 10;
        int l = k++; // Post Increment 
        System.out.println(k);
        System.out.println(l);


    }
}
