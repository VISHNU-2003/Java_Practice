import java.util.Arrays;

public class bbs {
    public static void main(String[] args) {
        int[] arr = {7,8,9,-1,99,10};
        bbss(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bbss(int[] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
