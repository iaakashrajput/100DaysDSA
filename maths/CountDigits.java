public class CountDigits {
    static void countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("The digits count is" + " " + count);
    }

    public static void main(String[] args) {
        countDigits(34455);
    }
}
