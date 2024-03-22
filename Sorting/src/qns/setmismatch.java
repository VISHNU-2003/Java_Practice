package qns;

import java.util.Arrays;

public class setmismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] ans = answer(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] answer(int[] arr) {
        int i = 0;
// Loop until the end of the array is reached
        while(i<arr.length){
            // Subtract 1 from the current element
            int ans = arr[i] - 1;
            // Check if the current element is not equal to the element at its correct position
            if(arr[i] != arr[ans]){
                // Swap the current element with the element at its correct position
                int t = arr[i];
                arr[i] = arr[ans];
                arr[ans] = t;
            }else{
                // Move to the next element if the current element is already at its correct position
                i++;
            }
        }

// Iterate through the array to find the first misplaced element
        for (int j = 0; j < arr.length; j++) {
            // If an element is not in its correct position, return it along with its correct position
            if(arr[j] != j+1){
                return new int[] {arr[j], j+1};
            }
        }

// If all elements are in their correct positions, return [-1, -1]
        return new int[] {-1,-1};
    }
}
