import java.math.BigInteger;

public class SumGarmin implements ISumFraction {
 private int n;

    public SumGarmin() {
        this.n = 0;
    }

    public SumGarmin(int n) {
        this.n = n;
    }
    public ISumFraction calculate() {
        ISumFraction result;
        if (n<20) {
            Fraction result = new Fraction();
            for (int i = 1; i <= n; i++) {
                result = result.add(new Fraction(1, i));
            }
            return result;
        }
        else {
            BigFraction result = new BigFraction();
            for (int i = 1; i <= n; i++) {
                result = result.add(new BigFraction(BigInteger.valueOf(1), BigInteger.valueOf(i)));
            }
            return result;
        }
    }


    @Override
    public ISumFraction calculate() {
        ISumFraction result;
        if (n<20) {
             result = new Fraction();
            for (int i = 1; i <= n; i++) {
                result = result.add(new Fraction(1, i));
            }
            return result;
        }
        else {
             result = new BigFraction();
            for (int i = 1; i <= n; i++) {
                result = result.add(new BigFraction(BigInteger.valueOf(1), BigInteger.valueOf(i)));
            }
            return result;
        }
    }
}
