public class Lcm {
    static int lcm(int a, int b) {
        int lcm = Math.max(a, b);
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                return lcm;
            } else {
                lcm++;
            }
        }
    }

    static int lcm2(int a, int b) {
        return (a * b) / gcd(a, b);

    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(lcm(12, 8));
        System.out.println(lcm2(12, 8));
    }
}
