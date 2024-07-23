package Arrays.Easy;

public class LeftRotateByD {
    static void reverse(int low, int high, int arr[]) {
        while (low <= high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    static void leftRotate(int arr[], int d, int n) {
        reverse(0, d - 1, arr);
        reverse(d, n - 1, arr);
        reverse(0, n - 1, arr);

    }

    static void rightRotate(int arr[], int d, int n) {
        reverse(0, n - 1, arr);
        reverse(0, d - 1, arr);
        reverse(d, n - 1, arr);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println("Array Before Rotation");
        for (int item : arr) {
            System.out.print(item + "");
        }
        /* Left rotating the array by 3 */
        leftRotate(arr, 3, 5);

        System.out.println();
        System.out.println("Array After Left Rotation");

        for (int item : arr) {
            System.out.print(item + "");
        }
        /* Right rotating the array by 3 */

        rightRotate(arr, 3, 5);

        System.out.println();
        System.out.println("Array After Right Rotation");

        for (int item : arr) {
            System.out.print(item + "");
        }

    }

}
