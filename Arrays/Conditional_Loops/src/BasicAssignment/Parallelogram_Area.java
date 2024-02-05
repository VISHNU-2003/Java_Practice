package BasicAssignment;
import java.util.Scanner;
public class Parallelogram_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the heigth and breadth of the Parallelogram: ");
        int h = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area of the Parallelogram is " + h*b);
    }
}

