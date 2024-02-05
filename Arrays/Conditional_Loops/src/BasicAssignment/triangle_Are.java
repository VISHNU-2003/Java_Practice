package BasicAssignment;
import java.util.Scanner;
public class triangle_Are {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Heigth and Breadth of the Triangle: ");
        int h = sc.nextInt();
        int b = sc.nextInt();
        double c = 0.5*b*h;
        System.out.println("Area of Triangle is "+c);
    }
}
