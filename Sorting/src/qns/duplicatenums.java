package qns;
public class duplicatenums {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {
        int i = 0; // Initialize a variable i to keep track of the current index in the array.
        while (i < nums.length) { // Start a while loop to iterate through the array until i reaches the end.
            int an = nums[i] - 1; // Calculate the "correct" index of the current number (subtract 1 because array indices start from 0).
            if (nums[i] != nums[an]) { // Check if the current number is not in its correct position.
                int t = nums[i]; // If not, swap the current number with the number at its correct position.
                nums[i] = nums[an];
                nums[an] = t;
            } else { // If the current number is already at its correct position, move to the next index.
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) { // Iterate through the array again to find the first number that is not in its correct position.
            if (nums[j] != j + 1) { // If the current number is not equal to j+1, it means j+1 is the duplicate number.
                return nums[j]; // Return the duplicate number.
            }
        }
        return -1; // If no duplicate is found, return -1.
    }
}
