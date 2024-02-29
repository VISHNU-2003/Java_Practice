import java.util.*;
public class RangeSearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int b = 3;
        int ans = xox(nums, b, 0, 9);
        System.out.println(ans);
    }
    public static int xox(int[] arr, int x, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int i=start; i<end;i++){
            int a = arr[i];
            if(a==x){
                return i;
            }
        }
        return -1;
    }
}
