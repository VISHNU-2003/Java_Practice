import java.util.*;
public class fullsorts {
    public static void main(String[] args) {
        int[] arr = {-5,6,3,2,1,0,4};
        bs(arr);
        System.out.println(Arrays.toString(arr));
        ss(arr);
        System.out.println(Arrays.toString(arr));
        ins(arr);
        System.out.println(Arrays.toString(arr));
        cysort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //Bubblesort.
    private static void bs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }
    //selectionSort
    private static void ss(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int max = ggetmax(arr, 0, last);
            swap(arr, max, last);
        }
    }

    private static int ggetmax(int[] arr, int a, int b) {
        int max = a;
        for (int i = a; i <= b; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    //InsertionSort
    private static void ins(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }
    //cyclesort
    private static void cysort(int[] arr){
        int i=0;
        while (i<arr.length){
            int ans = arr[i] - 1;
            if(ans >= 0 && ans < arr.length && arr[i] != arr[ans]){
                swap(arr, i, ans);
            }else {
                i++;
            }
        }
    }
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
