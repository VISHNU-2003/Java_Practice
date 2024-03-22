import java.util.*;
public class bsp {
    public static void main(String[] args) {
        int[] arr = {-1,8,-0,6,3,33,-52,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bspp(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxi = getmaxi(arr, 0, last);
            swapii(arr, maxi, last);
        }
    }
    private static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swapii(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    public static void swapii(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    private static int getmaxi(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
