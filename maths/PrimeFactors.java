public class PrimeFactors {
    static void primeFactors(int n) {
        if (n <= 1)
            return;
        for (int i = 2; i * 1 <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
        }
        if (n > 1) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        primeFactors(35);
    }
}
