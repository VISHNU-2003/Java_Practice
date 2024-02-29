import java.util.*;
public class findevedigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length; i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int count = 0;
        while (num > 0){
            count++;
            num /= 10;
        }
        return count % 2 ==0;
    }
}
