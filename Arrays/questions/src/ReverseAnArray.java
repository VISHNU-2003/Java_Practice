import java.util.*;
public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,9,8};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
       while(start<end){
           swap(arr, start, end);
           start++;
           end--;
       }
    }

    static void swap(int[] arr, int a, int b){
        int x = arr[a];
        arr[a] = arr[b];
        arr[b] = x;
    }
}
