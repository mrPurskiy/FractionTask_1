import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
        int n = 4;
        SumGarmin sumOfN = new SumGarmin(n);
        System.out.println(sumOfN.sum());
    }
}