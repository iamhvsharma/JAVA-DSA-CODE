public class largestOf3{
    public static void main(String args[]){
        int A = 1;
        int B = 3;
        int C = 6;

        if((A>=B)&&(A>=C)){
            System.out.println("A is largest, A = " + A);
        }
        else if(B>=C){
            System.out.println("B is largest, B = " + B);

        }
        else{
            System.out.println("C is largest, C = " + C);

        }




    }
}