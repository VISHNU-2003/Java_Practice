package qns;
import java.util.*;
public class find_all_disappeard_nums {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> disappearedNumbers = findDisappearedNumbers(arr);
        System.out.println(disappearedNumbers);
    }

    private static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0; // Initialize a variable i to keep track of the current index
        while (i < arr.length) { // Loop through the array until i reaches the end
            int ans = arr[i] - 1; // Calculate the index where the current element should be placed
            if (arr[i] != arr[ans]) { // Check if the current element is not in its correct position
                int temp = arr[i]; // Store the current element in a temporary variable
                arr[i] = arr[ans]; // Move the correct element to the current position
                arr[ans] = temp; // Place the current element in its correct position
            } else { // If the current element is in its correct position
                i++; // Move to the next index
            }
        }

        List<Integer> ansList = new ArrayList<>(); // Create a list to store disappeared numbers
        for (int j = 0; j < arr.length; j++) { // Loop through the array
            if (arr[j] != j + 1) { // If the value at index j does not match its expected value (1-indexed)
                ansList.add(j + 1); // Add the missing number (1-indexed) to the list
            }
        }
        return ansList; // Return the list of disappeared numbers
    }

}
