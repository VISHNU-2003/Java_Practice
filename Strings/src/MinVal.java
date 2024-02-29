import java.util.*;
public class MinVal {
    public static void main(String[] args) {
        int[] arr = {1,225,88,9,63,0};
        System.out.println(Arrays.toString(arr));
        int min = minVal(arr);
        System.out.println(min);
    }
    public static int minVal(int[] a){
        int minVal = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i] < minVal){
                minVal = a[i];
            }
        }
        return  minVal;
    }
}
