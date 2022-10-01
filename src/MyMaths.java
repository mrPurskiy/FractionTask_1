 public class MyMaths {
    static public int nsd(int a, int b) {
        {
            if (b == 0) return a;
            return nsd(b, a % b);
        }
    }
}
