package qns;

import java.util.Arrays;

public class Firstmissingpositive {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int i = 0;
// Iterate through the array
        while (i < arr.length) {
            // Calculate the index for the current element
            int a = arr[i] - 1;
            // Check if the current element is positive and within the bounds of the array, and if it's not already in its correct position
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[a]) {
                // Swap the current element with the element at its correct position
                int t = arr[i];
                arr[i] = arr[a];
                arr[a] = t;
            } else {
                // Move to the next element if the current element is already in its correct position or if it's not a positive integer or out of bounds
                i++;
            }
        }

// Find the first missing positive integer
        for (int j = 0; j < arr.length; j++) {
            // If an element is not equal to its index + 1, return the missing positive integer
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }

// If all positive integers from 1 to n are present in the array, return the next positive integer
        return arr.length + 1;
    }
}
