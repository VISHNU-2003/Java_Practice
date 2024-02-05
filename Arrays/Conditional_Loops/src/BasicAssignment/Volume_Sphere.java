package BasicAssignment;
import  java.util.Scanner;
public class Volume_Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of the sphere: " );
        int r = sc.nextInt();
        double res = (4.0/3)*r*r*r*(22.0/7);
        System.out.println("Volume of the Sphere is: " + res);
    }
}
