import java.util.*;
import java.util.Scanner;
public class qnsArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }
}
