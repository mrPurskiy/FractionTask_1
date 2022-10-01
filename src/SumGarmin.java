public class SumGarmin {
 private int n;

    public SumGarmin() {
        this.n = 1;
    }

    public SumGarmin(int n) {
        this.n = n;
    }
    public Fraction sum()
    {
        Fraction result = new Fraction();
        for(int i = 1;i <= n;i++)
        {
            result = result.add(new Fraction(1,i));
        }
        return result;
    }
}
