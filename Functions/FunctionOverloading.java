public class FunctionOverloading{

    // Function Overloading using Parameters
    // public static int sum(int a, int b){
    //     return a + b;
    // }

    // public static int sum(int a, int b, int c){
    //     return a + b + c;
    // }

    // Function Overloading using Datatypes
    public static int sum(int a, int b){
        return a + b;
    }

    public static float sum(float a, float b){
        return a + b;
    }


    public static void main(String args[]){
        System.out.println(sum(10, 16));
        System.out.println(sum(10.5f, 11.2f));
    }
}