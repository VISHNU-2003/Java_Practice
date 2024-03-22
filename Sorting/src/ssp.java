import java.util.*;
public class ssp {
    public static void main(String[] args) {
        int[] arr = {-1,8,-0,6,3,33,-52,1};
        sos(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sos(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxindex = getmaxs(arr, 0, last);
            swaping(arr, maxindex, last);
        }
    }

    private static void swaping(int[] arr, int a, int b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
    }

    private static int getmaxs(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
