package BasicAssignment;
import java.util.Scanner;
public class Volume_Prism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basearea and height of the prism");
        int a = sc.nextInt();
        int h = sc.nextInt();
        int res = a*h;
        System.out.println("Volume of the prism is " + res);
    }
}
