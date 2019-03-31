public class Main {

    public static void main(String[] args) {
        int s = gcd(10 ,2);
        System.out.println(s);
    }

    public static int gcd(int p, int q)
    {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

}
