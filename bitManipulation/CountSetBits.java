public class CountSetBits {
    // Navive solution doing & operation with 1 the shifting to riht by 1;
    static int countBits(int n) {
        int res = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                res++;
            }
            n = n >> 1;
        }
        return res;
    }

    // Brian Kerningams's algorithm
    static int countBitBrianKerningam(int n) {
        int res = 0;
        while (n != 0) {
            n = n & (n - 1);
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countBits(7));
        System.out.println(countBitBrianKerningam(10));
    }
}
