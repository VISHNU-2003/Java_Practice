package BasicAssignment;
import java.util.Scanner;
public class Perimeter_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Side of the Square: ");
        int s = sc.nextInt();
        int p = 4*s;
        System.out.println("Perimeter of the Square is: " + p);
    }
}
