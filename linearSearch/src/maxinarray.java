import java.util.*;
public class maxinarray {
    public static void main(String[] args) {
        int[] nums = {8,88,888,9,6,3,21,54};
        System.out.println(max(nums));
    }
    static int max(int[] arr){
        if(arr.length == 0){
            return  -1;
        }
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
