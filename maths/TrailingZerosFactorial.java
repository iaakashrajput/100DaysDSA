class TrailingZerosFactorial {

    // Brute force approach will overflow integer value
    static int countZeros(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        int count = 0;
        while (fact % 10 == 0) {
            count++;
            fact = fact / 10;
        }
        return count;
    }

    // Optimized approach using prime factore of 5
    static int countZeros2(int n) {
        int count = 0;
        for (int i = 5; i <= n; i *= 5) {
            count += n / i;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countZeros2(28));
    }
}