import java.sql.SQLOutput;
import java.util.*;
public class AddMatrix2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] x = new int[3][3];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                a[i][j] = sc.nextInt();
            }
        }
       //addition logic
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<a[0].length;k++){
                    x[i][j] = a[i][k]+b[k][j];
                }
            }
        }
//        output
        System.out.println("Sum of two matrices IS:- ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<x[i].length;j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}
