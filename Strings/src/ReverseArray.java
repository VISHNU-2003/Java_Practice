import java.util.*;
public class ReverseArray {
    public static void main(String[] args){
//        int[] arr = {2,22,43,51,557,63};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
      Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Reverse(int[] a){
        int start = 0;
        int end = a.length-1;
        while(start<end){
            swap(a, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] a , int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
