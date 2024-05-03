public class ternaryOperator{
    public static void main (String args[]){
        int num = 5;

        // ternary op 
        String type = ((num % 2) == 0) ? "even" : "odd";
        System.out.println(type);
    }
}