public class GCD {
    // This is the implemenation of Euclid algorithm
    static int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;

    }

    static int gcdSub(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }

        }
        return a;

    }

    static int gcdRecursive(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcdRecursive(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(42, 24));
        System.out.println(gcdRecursive(24, 42));
    }
}
