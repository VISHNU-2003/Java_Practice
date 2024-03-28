public class Solution {
    public static int[] printNos(int n) {
        // Create an array to store the numbers
        int[] result = new int[n];
        // Start recursion from 1
        printNumbers(1, n, result);
        // Return the result array
        return result;
    }
    
    // Recursive function to populate the array with numbers
    private static void printNumbers(int current, int n, int[] result) {
        // Base case: if current exceeds n, return
        if (current > n)
            return;
        // Store the current number in the array
        result[current - 1] = current;
        // Recur for the next number
        printNumbers(current + 1, n, result);
    }
    
    public static void main(String[] args) {
        int n = 5;
        int[] numbers = printNos(n);
        // Print the numbers in the array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
