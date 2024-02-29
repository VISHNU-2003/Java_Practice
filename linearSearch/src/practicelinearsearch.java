import java.util.*;
public class practicelinearsearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5 ,6};
        int target = 3;
//        int ans = linearSearch.linearSearching(nums, target);
        int ans = naa(nums, target);
        int o = vaa(nums, target);
        System.out.println("Index no: "+ans);
        System.out.println("Searching for" +o);

    }
    static int naa(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            int x = arr[i];
            if(x == target){
                return i;
            }
        }
        return  -1;
    }
    static int vaa(int[] arr, int target){
        if(arr.length ==0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            int a = arr[i];
            if(a == target){
                return a;
            }
        }
        return -1;
    }
}
