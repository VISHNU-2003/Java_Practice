package BasicAssignment;
import java.util.Scanner;
public class Equilateral_tri_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the eqtriangle: ");
        int s = sc.nextInt();
        double r = (Math.sqrt(3)/4)*s*s;
        System.out.println("Area of EqiTriangle is: " + r);
    }
}
