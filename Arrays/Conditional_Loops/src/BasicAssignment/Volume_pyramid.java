package BasicAssignment;
import java.util.Scanner;
public class Volume_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the BaseArea and height of the pyramid: ");
        int a = sc.nextInt();
        int h = sc.nextInt();
        double res = (1.0/3)*a*h;
        System.out.println("Volume of the pyramid is: "+ res);
    }
}