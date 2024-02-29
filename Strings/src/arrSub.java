import java.util.*;
public class arrSub {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the values in array: ");
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int sub = arr[0];
        for(int i=1;i<arr.length;i++){
            sub -= arr[i];
        }
        System.out.println("Subtraction is " + sub);
    }
}
