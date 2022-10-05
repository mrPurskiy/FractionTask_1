import java.math.BigInteger;

public class BigFraction implements ISumFraction{
    private BigInteger numerator;
    private BigInteger denominator;

    public BigFraction() {
        this.numerator = new BigInteger(String.valueOf(0));
        this.denominator = new BigInteger(String.valueOf(1));
    }

    public BigFraction(BigInteger numerator, BigInteger denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public BigInteger getNumerator() {
        return numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    public void setNumerator(BigInteger numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(BigInteger denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return "BigFraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
    public void reduce() {
        BigInteger nsd_value =  MyMaths.NSD(numerator, denominator);
        numerator =  numerator.divide(nsd_value);
        denominator =  denominator.divide(nsd_value);



        System.out.println(numerator+ "/" + denominator);
    }

    public BigFraction add(BigFraction element)
    {
        BigFraction result = new BigFraction(numerator.multiply(element.getDenominator()).add(denominator.multiply(element.getNumerator()))   ,
                denominator.multiply(element.getDenominator()));
        result.reduce();
        return result;
    }

    @Override
    public ISumFraction add(ISumFraction element) {
        return this.add((BigFraction) element);
    }
    public BigFraction multiply(BigFraction element)
    {
        BigFraction result = new BigFraction(numerator.multiply(element.getNumerator()),denominator.multiply(element.getDenominator()));
        result.reduce();
        return result;
    }
}
