public class BinomialCofficient{

    public static int fact(int n) {
        int f = 1;
        
        for(int i = 1; i<=n; i++){
            f = f * i;
        }
        return f; // Factorial of n
    }

    public static int binCoefficient(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;

    }

    public static void main(String args[]){
        System.out.println(binCoefficient(5, 2));
    }
}