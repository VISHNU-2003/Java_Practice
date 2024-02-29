//https://leetcode.com/problems/richest-customer-wealth/description/
import java.util.*;
public class Wealth {
    public static void main(String[] args) {
        int[][] arr = {{1,5},{7,3},{3,5}};
        System.out.println(find(arr));
    }
    static int find(int[][] arr){
        int ans = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            int sum = 0;

            for(int j=0; j<arr[i].length; j++){
                 sum += arr[i][j];
            }
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
