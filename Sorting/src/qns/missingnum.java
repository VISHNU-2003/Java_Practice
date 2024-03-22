package qns;
import java.util.*;
//https://leetcode.com/problems/missing-number/description/
public class missingnum {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int i = 0; // Initialize a variable i to keep track of the current index
        while (i < arr.length) { // Loop through the array until i reaches the end
            int anss = arr[i]; // Store the value at index i in the variable anss
            if (arr[i] < arr.length && arr[i] != arr[anss]) { // Check if the value at index i is within bounds and not equal to the value at the index it points to
                int temp = arr[i]; // Store the value at index i in a temporary variable temp
                arr[i] = arr[anss]; // Assign the value at the index pointed by arr[i] to arr[i]
                arr[anss] = temp; // Assign the value stored in temp to the index pointed by arr[i]
            } else { // If the condition is not met
                i++; // Increment i to move to the next index
            }
        }
        // Search for the first index where the value is not equal to its index
        for (int j = 0; j < arr.length; j++) { // Loop through the array
            if (arr[j] != j) { // If the value at index j is not equal to j
                return j; // Return the index j
            }
        }
        return arr.length; // If no such index is found, return the length of the array
    }

}
