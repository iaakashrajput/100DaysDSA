package Arrays.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLeaders {

    // This is the Efficient Approach
    static List<Integer> findLeaders(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int cur_leader = arr[n - 1];
        list.add(cur_leader);

        for (int i = n - 2; i > 0; i--) {
            if (arr[i] > cur_leader) {
                cur_leader = arr[i];
                list.add(cur_leader);
            }
        }
        return list;
    }

    // This is the Brute Force Approach

    static List<Integer> findLeadersNaive(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                list.add(arr[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 7, 3, 6, 2, 5, 1, 4, 2 };
        int arr2[] = { 1, 7, 3, 6, 2, 5, 1, 4, 2 };

        List<Integer> list1 = findLeaders(arr1, 9);
        System.out.println("Printing leaders With Efficient Approach");
        Collections.reverse(list1);
        for (Integer item : list1) {
            System.out.print(item + " ");
        }

        System.out.println();

        List<Integer> list2 = findLeadersNaive(arr2, 9);
        System.out.println("Printing leaders With Brute Force Approach");
        for (Integer item : list2) {
            System.out.print(item + " ");
        }

    }
}
