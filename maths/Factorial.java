public class Factorial {
    static int factIterative(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
        // O(N) Time and o(1) auxiliary space
    }

    static int factRecursive(int n) {
        if (n == 0)
            return 1;

        return n * factRecursive(n - 1);

        // O(N) Time And Auxiliary Space
    }

    public static void main(String[] args) {
        System.out.println(factIterative(5));

        System.out.println(factRecursive(4));
    }
}
