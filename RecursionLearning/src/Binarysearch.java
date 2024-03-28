import java.util.*;
public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,2,7};
        Arrays.sort(arr);
        int target = 7;
        System.out.println(search(arr, target, 0 , 6));
    }
    private static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m+1, e);
    }
}
