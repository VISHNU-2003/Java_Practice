package BasicAssignment;
import java.util.Scanner;
public class volume_Cone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and height of the cone: ");
        int r = sc.nextInt();
        int h = sc.nextInt();
        double res = (1.0/3)*(r*r*h);
        System.out.println("Volume of Cone is: " + res);
    }
}
