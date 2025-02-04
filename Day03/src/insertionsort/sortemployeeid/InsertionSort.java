package insertionsort.sortemployeeid;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Move elements that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] employeeIDs = {5, 3, 8, 4, 2};
        insertionSort(employeeIDs);
        System.out.println("Employee IDs before sorting" + Arrays.toString(employeeIDs));
        insertionSort(employeeIDs);
        System.out.println("\nEmployee IDs after sorting" + Arrays.toString(employeeIDs));
    }
}
