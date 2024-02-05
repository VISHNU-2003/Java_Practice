package BasicAssignment;
import java.util.Scanner;
public class Rhombu_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height and length of the rhombus to get the area");
        int h = sc.nextInt();
        int l = sc.nextInt();
        int c = (l*h)/2;
        System.out.println("Area of Rhombus is: " + c);
    }
}
