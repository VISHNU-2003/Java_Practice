import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        int[] nums = {1,2,5,6,8,9,222,223,65,6,88,2};
        int target = 5;
        int ans = linearSearching(nums, target);
        System.out.println(ans);
    }
    static int linearSearching(int[] arr, int target) {
        //if the length of the array is 0:
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            //check for every index if it is == target.
            int a = arr[i];
            if (a == target) {
                return i;
            }
        }
//        for(int a: arr){
//            if(a==target){
//                return a;
//            }
//        }
        //if there is no item found in the array return -1;
        return -1;
    }
}

