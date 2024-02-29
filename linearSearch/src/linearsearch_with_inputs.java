import java.util.*;
public class linearsearch_with_inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[7];
        System.out.println("Enter the numbers with size 7 seperated spaces ");
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
        System.out.println("Enter the target ");
        int target = sc.nextInt();
        int ans = linearSearching(nums, target);
        System.out.println("The index of the searching number is: " + ans);
    }
    static int linearSearching(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int a = arr[i];
            if(a==target){
                return i;
            }
        }
        return -1;
    }
}
