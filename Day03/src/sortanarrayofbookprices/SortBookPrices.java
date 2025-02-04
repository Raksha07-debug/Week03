package sortanarrayofbookprices;
import java.util.*;

public class SortBookPrices {

    public static void divide(double bookPrice[], int s, int e) {
        if (s >= e) return;
        int mid = s + (e - s) / 2;
        divide(bookPrice, s, mid);
        divide(bookPrice, mid + 1, e);
        conquer(bookPrice, s, mid, e);
    }

    public static void conquer(double bookPrice[], int s, int mid, int e) {
        double merge[] = new double[e - s + 1];
        int idx1 = s, idx2 = mid + 1, x = 0;

        while (idx1 <= mid && idx2 <= e) {
            if (bookPrice[idx1] <= bookPrice[idx2]) {
                merge[x++] = bookPrice[idx1++];
            } else {
                merge[x++] = bookPrice[idx2++];
            }
        }

        while (idx1 <= mid) {
            merge[x++] = bookPrice[idx1++];
        }

        while (idx2 <= e) {
            merge[x++] = bookPrice[idx2++];
        }

        for (int i = 0, j = s; i < merge.length; i++, j++) {
            bookPrice[j] = merge[i];
        }
    }

    public static void main(String[] args) {
        // Array to store 10 book prices
        double[] bookPrices = {25.99, 15.49, 45.75, 22.35, 10.99, 30.50, 18.75, 40.90, 12.99, 35.00};

        // Display the book prices before sorting
        System.out.println("Book Prices before sorting: " + Arrays.toString(bookPrices));

        // Sort the array using merge sort
        divide(bookPrices, 0, bookPrices.length - 1);

        // Display the book prices after sorting
        System.out.println("\nBook Prices after sorting: " + Arrays.toString(bookPrices));
    }
}
