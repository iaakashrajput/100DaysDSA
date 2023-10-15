public class BitOperations {
    static void getKthBit(int n, int p) {

        int mask = (1 << (p - 1));

        System.out.println(mask);
        System.out.println(n & mask);
        // return ((n & mask) == 1);
        if ((n & (1 << p)) != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }

    static int setKthBit(int n, int p) {
        return n | (1 << p);
    }

    static int clearKthBit(int n, int p) {
        int mask = ~(1 << p);
        return n & mask;
    }

    static int updateKthBit(int n, int p) {
        int mask = ~(1 << p);
        n = n & mask;
        return n | (1 << p);
    }

    public static void main(String[] args) {
        getKthBit(10, 3);
        // System.out.println(getKthBit(5, 3));
    }
}
