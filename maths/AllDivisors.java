class AllDivisors {
    static void printDivisors(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (i != (n / i))
                    System.out.println(n / i);
            }
        }
    }

    static void printDivisorsSorted(int n) {
        int i;
        for (i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        for (; i >= 1; i--) {
            if (n % i == 0) {
                System.out.println(n / i);
            }
        }
    }

    public static void main(String[] args) {
        // printDivisors(15);
        printDivisorsSorted(15);
    }
}