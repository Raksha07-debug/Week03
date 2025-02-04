package selectionsort;
import java.util.*;

public class sortexamscores {
    // Method to perform selection sort on an array of scores
    public static void selectionSort(int scores[]) {
        int n = scores.length;
        for(int i = 0; i < n-1; i++) {
            int smallest = i;
            for(int j = i + 1; j < n; j++) {
                if(scores[smallest] > scores[j]) {
                    smallest = j;
                }
                // Swap the smallest element found with the current element
                int temp = scores[smallest];
                scores[smallest] = scores[i];
                scores[i] = temp;
            }
        }
    }

    public static void main(String args[]) {
        // Declare an array to store scores
        int[] scores = {87, 85, 95, 92, 88, 89, 93, 81, 83};
        // Display the scores before sorting
        System.out.println("Scores before sorting: " + Arrays.toString(scores));

        // Sort the scores using selection sort
        selectionSort(scores);

        // Display the scores after sorting
        System.out.println("\nScores after sorting: " + Arrays.toString(scores));
    }
}
