public class Palindrome {
    static boolean isPalindrome(int num) {
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum = sum * 10 + rem;
            temp = temp / 10;
        }
        return sum == num;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
