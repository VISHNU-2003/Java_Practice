import java.util.*;
public class passing_of_an_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int change(int[] a){
        a[0] = 100;
        return a[0];
    }
}
