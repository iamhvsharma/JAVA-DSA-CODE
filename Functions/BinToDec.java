// Program to Convert Binary number into Decimal number

public class BinToDec{
    public static void bToD(int binNum){
        int pow = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }

        System.out.println("The Decimal of Given binary number is : " + decNum);
    }

    public static void main(String args[]){
        bToD(101);
    }
}