import java.math.BigInteger;

public class MyMaths {
    static public int nsd(int a, int b) {
        {
            if (b == 0) return a;
            return nsd(b, a % b);
        }
    }
    static public BigInteger NSD(BigInteger a, BigInteger b){
        {
            BigInteger zero = new BigInteger("0");
            int flag = b.compareTo(zero);
            if (flag == 0) {
                return a;
            }
            return NSD(b, a.mod(b));
        }

    }

}
