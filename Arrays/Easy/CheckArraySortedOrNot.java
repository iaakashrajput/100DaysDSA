package Arrays.Easy;

/**
 * CheckArraySortedOrNot
 */
public class CheckArraySortedOrNot {
    public static boolean checkSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 6, 7 };
        boolean sorted = checkSorted(arr);
        if (sorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

    }
}