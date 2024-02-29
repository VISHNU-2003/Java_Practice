import java.util.*;
public class LinearSearchin2Darr {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8,9,10},
                {11,121,12,56,11}
        };
        int target = 121;
        int[] ans = Searchin2d(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Searchin2d(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
