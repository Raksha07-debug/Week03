package quicksort;
import java.util.*;

public class Sortproductprices {

    // Method to perform Quick Sort
    public static void quickSort(double[] productPrices, int low, int high) {
        if (low < high) {
            // Find the pivot element such that elements less than pivot are on the left,
            // elements greater than pivot are on the right
            int pivot = partition(productPrices, low, high);
            // Recursively sort the elements before and after the pivot
            quickSort(productPrices, low, pivot - 1);
            quickSort(productPrices, pivot + 1, high);
        }
    }

    // Method to partition the array and return the pivot index
    public static int partition(double productPrices[], int low, int high) {
        double pivot = productPrices[high]; // Choose the last element as the pivot
        int i = low - 1; // Index of smaller element
        for (int j = low; j < high; j++) {
            if (productPrices[j] <= pivot) { // If current element is smaller than or equal to pivot
                i++;
                // Swap productPrices[i] and productPrices[j]
                double temp = productPrices[i];
                productPrices[i] = productPrices[j];
                productPrices[j] = temp;
            }
        }
        // Swap productPrices[i + 1] and productPrices[high] (or pivot)
        i++;
        double temp = productPrices[i];
        productPrices[i] = productPrices[high];
        productPrices[high] = temp;
        return i;
    }

    public static void main(String[] args) {
        // Array to store 10 product prices
        double[] productPrices = {25.99, 15.49, 45.75, 22.35, 10.99, 30.50, 18.75, 40.90, 12.99, 35.00};

        // Display the product prices before sorting
        System.out.println("Product Prices before sorting: " + Arrays.toString(productPrices));

        // Sort the array using Quick Sort
        quickSort(productPrices, 0, productPrices.length - 1);

        // Display the product prices after sorting
        System.out.println("\nProduct Prices after sorting: " + Arrays.toString(productPrices));
    }
}
