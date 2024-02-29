import java.util.*;
public class MaxVal {
    public static void main(String[] args){
        int[] arr = {1,22,3,66,88,100};
        System.out.println(Arrays.toString(arr));
        int max = maxVal(arr);
        System.out.println(max);
    }
    static int maxVal(int[] a){
        int MaxVal = a[0];
        for(int i=1;i<=a.length-1;i++){
            if(a[i] > MaxVal){
                MaxVal = a[i];
            }
        }
        return MaxVal;
    }
}
