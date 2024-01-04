package BasicAssignment;
import  java.util.Scanner;
public class Perimeter_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle");
        int r = sc.nextInt();
        double res = 2*(22/7)*r;
        System.out.println("Perimeter of the Circle " +res);
    }
}
