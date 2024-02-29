//This shows when the user enter the number it give the fibonacci number of that particular position

package BasicAssignment;
import java.util.Scanner;
public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth number you need ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i=2;i<=n;i++){
            int x = b;
            b = b+a;
            a = x;
        }
        System.out.println(b);
    }
}
