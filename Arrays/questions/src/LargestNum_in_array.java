import java.util.*;
public class LargestNum_in_array {
    public static void main(String[] args) {
        int[] arr = {1,22,33,44,5,500,5};
        System.out.println(Arrays.toString(arr));
        System.out.println(maxRange(arr, 1, 4));
    }
    static int maxRange(int[] arr, int start, int end){
//        if(end > start){
//            return -1;
//        }
//        if(arr == null){
//            return -1;
//        }
        int maxValue = arr[start];
        for(int i = start; i <= end; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
