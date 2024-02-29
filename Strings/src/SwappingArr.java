import java.util.*;
public class ReverseArray {
    public static void main(String[] args){
    int[] arr = {1,2,5,6,9,8,100};
    System.out.println("original array " + Arrays.toString(arr));
    swap(arr, 2, 3);

        System.out.println("Swapped array" + Arrays.toString(arr));
    }
    public static void swap(int[] a, int x, int y){
      int o = a[x];
      a[x] = a[y];
      a[y] = o;
    }
}
