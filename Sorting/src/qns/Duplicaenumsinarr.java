package qns;

import java.util.ArrayList;
import java.util.List;

public class Duplicaenumsinarr {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDuplicates(arr);
        System.out.println(ans);
    }

    private static List<Integer> findDuplicates(int[] arr) {
        int i = 0; // Initialize a variable i to keep track of the current index in the array.
        while (i < arr.length) { // Start a while loop to iterate through the array until i reaches the end.
            int a = arr[i] - 1; // Calculate the "correct" index of the current number (subtract 1 because array indices start from 0).
            if (arr[i] != arr[a]) { // Check if the current number is not in its correct position.
                int t = arr[i]; // If not, swap the current number with the number at its correct position.
                arr[i] = arr[a];
                arr[a] = t;
            } else { // If the current number is already at its correct position, move to the next index.
                i++;
            }
        }

        List<Integer> ans = new ArrayList<Integer>(); // Create a new ArrayList to store the duplicate numbers.
        for (int j = 0; j < arr.length; j++) { // Iterate through the array again to find the duplicate numbers.
            if (arr[j] != j + 1) { // If the current number is not equal to j+1, it means j+1 is a duplicate number.
                ans.add(arr[j]); // Add the duplicate number to the ArrayList.
            }
        }
        return ans; // Return the ArrayList containing the duplicate numbers.
    }
}
