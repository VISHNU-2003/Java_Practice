package BasicAssignment;
import java.util.Scanner;
public class Circle_Area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle: ");
        int radius = sc.nextInt();
        int b = (22/7)*radius*radius;
        System.out.println("Area of the Circle is " + b);

    }
}
