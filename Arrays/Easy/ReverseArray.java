package Arrays.Easy;

public class ReverseArray {
    public static int[] bruteForceReverse(int[] arr) {
        int n = arr.length;
        int reversedArr[] = new int[arr.length];
        for (int i = 0; i < n; i++) {
            reversedArr[i] = arr[n - 1 - i];
        }
        return reversedArr;
    }

    public static int[] optimalReverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 6, 7 };
        int bruteReversed[] = bruteForceReverse(arr);
        System.out.println("Brute Force Reversed");
        for (int el : bruteReversed) {
            System.out.print(el);

        }
        System.out.println();

        int optimalReversed[] = optimalReverse(arr);
        System.out.println("Optimal Reversed");
        for (int el : optimalReversed) {
            System.out.print(el);

        }

    }
}
