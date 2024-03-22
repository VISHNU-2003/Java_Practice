import java.util.*;
public class cycle  {
    public static void main(String[] args) {
        int[] arr = {3,5,4,2,1};
        csort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void csort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int ans = arr[i] - 1;
            if(arr[i] != arr[ans]){
                bsp.swapii(arr, i, ans);
            }else{
                i++;
            }
        }
    }
}
