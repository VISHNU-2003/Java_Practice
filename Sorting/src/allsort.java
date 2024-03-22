import java.util.*;
public class allsort {
    public static void main(String[] args) {
        int[] arr = {-1,8,-0,6,3,33,-52,1};
        isoort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void swapy(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    private static void bsoort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                    swapy(arr, j, j-1);
                }
            }
        }
    }
    private static void isoort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j] < arr[j-1]){
                    swapy(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }
    private static void ssooort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i- 1;
            int max = getmaxies(arr, 0, last);
            swapy(arr, max, last);
        }
    }

    private static int getmaxies(int[] arr, int a, int b) {
        int max = a;
        for (int i = a; i <= b; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
