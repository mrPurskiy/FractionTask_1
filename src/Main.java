import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter n to calculate sum");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        SumGarmin sum = new SumGarmin(n);
        sum.calculate();

    }
}