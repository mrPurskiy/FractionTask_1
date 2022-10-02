public class Fraction implements ISumFraction{
    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 0;
        denominator = 1;
    }
    public Fraction(Fraction element) {
        this.numerator = element.numerator;
        this.denominator = element.denominator;
    }
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }










    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
public void reduce() {
        int nsd_value =  MyMaths.nsd(numerator,denominator);
        numerator /= nsd_value;
        denominator /= nsd_value;



    System.out.println(numerator+ "/" + denominator);
}


//    public Fraction add(Fraction element)
//    {
//        Fraction result = new Fraction(numerator*element.getDenominator() + denominator* element.getNumerator() ,denominator*element.getDenominator());
//        result.reduce();
//        return result;
//    }

    @Override
    public ISumFraction add(ISumFraction element) {
        Fraction result = new Fraction(numerator*element.getDenominator() + denominator* element.getNumerator() ,denominator*element.getDenominator());
        result.reduce();
        return result;
    }
}
