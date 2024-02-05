package BasicAssignment;
import java.util.Scanner;
public class TSA_Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the cube");
        int s = sc.nextInt();
        int res = 6*s*s;
        System.out.println("Tsa of cube is: "+res);
    }
}
