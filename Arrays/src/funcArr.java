import java.util.*;
public class funcArr {
    // function using arrays.
    public static void main(String[] args){
    int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void change(int[] arr){
        arr[3] = 99;
    }
}

