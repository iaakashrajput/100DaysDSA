import java.util.Arrays;

public class CountPrimeSieve {
    // Sieve for stantones alogo for counting prime numbers
    static int countPrime(int n) {
        int count = 0;

        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i] == true) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(countPrime(499979));
        System.out.println(countPrime(1000));
    }
}
