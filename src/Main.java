import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// System.out.println("enter n to calculate sum");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        SumGarmin sum = new SumGarmin(n);
//        sum.calculate();
        BigInteger x = new BigInteger("2");
        BigInteger y = new BigInteger("5");
        BigInteger x2 = new BigInteger("3");
        BigInteger y2 = new BigInteger("7");
        BigFraction fisrt = new BigFraction(x,y);
        BigFraction second = new BigFraction(x2,y2);
        BigFraction result = new BigFraction();
       result =  fisrt.multiply(second);


    }
}