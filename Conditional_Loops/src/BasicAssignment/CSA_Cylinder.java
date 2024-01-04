package BasicAssignment;
import java.util.Scanner;
public class CSA_Cylinder {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the radius and height of the cylinder: ");
        int r = sc.nextInt();
        int h = sc.nextInt();
        double res = 2*(22.0/7)*r*h;
        System.out.println("Curved Surface Area of Cylinder Is: " + res);
    }
}
