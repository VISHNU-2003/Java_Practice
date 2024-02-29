import java.util.*;
public class finding_nums_in_array {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6};
        System.out.println(digi(arr));
    }
    static int digi(int[] arr){
        int totdig = 0;
        for(int i =0; i<arr.length; i++){
         totdig += countdig(i);
        }
        return totdig;
    }
    static int countdig(int num){
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num != 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
