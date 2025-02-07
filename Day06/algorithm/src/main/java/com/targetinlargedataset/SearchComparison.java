package com.targetinlargedataset;

import java.util.Arrays;

public class SearchComparison {

    // Linear Search Function (O(N))
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Target found at index i
            }
        }
        return -1; // Target not found
    }

    // Binary Search Function (O(log N))
    public static int binarySearch(int[] arr, int target) {
       
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found at index mid
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }

    // Method to generate random dataset
    public static int[] generateDataset(int size) {
        int[] dataset = new int[size];
        for (int i = 0; i < size; i++) {
            dataset[i] = (int) (Math.random() * 10000); // Random numbers between 0 and 9999
        }
        return dataset;
    }

    public static void main(String[] args) {
        int[] datasetSizes = {1000, 10000, 1000000};
        int target = 5000; // Example target to search for

        // Loop through different dataset sizes
        for (int size : datasetSizes) {
            int[] dataset = generateDataset(size);

            // Linear Search Test
            long startTime = System.nanoTime();
            linearSearch(dataset, target);
            long endTime = System.nanoTime();
            long linearSearchTime = endTime - startTime;

            // Binary Search Test
            Arrays.sort(dataset); // Sorting the array for Binary Search
            startTime = System.nanoTime();
            binarySearch(dataset, target);
            endTime = System.nanoTime();
            long binarySearchTime = endTime - startTime;

            // Print the results
            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search Time: " + linearSearchTime / 1000000.0 + " ms");
            System.out.println("Binary Search Time: " + binarySearchTime / 1000000.0 + " ms");
            System.out.println();
        }
    }
}
