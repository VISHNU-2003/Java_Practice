import java.util.*;
public class arrSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array: ");
        int a  = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the Numbers of the Array: ");
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Sum of the numbers in array is " + sum);

    }
}
