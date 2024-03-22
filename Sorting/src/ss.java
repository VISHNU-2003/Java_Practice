//selection sort: sorting the elements according to their selected index
import java.util.*;
public class ss {
    public static void main(String[] args) {
        int[] arr = {3,5,4,2,-1,0,-32};
        ssort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void ssort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxindex = getmax(arr, 0, last);
            swap(arr, maxindex, last);

        }
    }

    private static void swap(int[] arr, int first, int l) {
        int temp = arr[first];
        arr[first] = arr[l];
        arr[l] = temp;
    }

    private static int getmax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <=end; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
