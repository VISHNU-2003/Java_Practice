import java.util.*;

public class practice_matrixMulti {
    public static void main (String[] args){
        Scanner c = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] x = new int[3][3];
        //for first Input;
        System.out.println("Enter the First Matrix: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j] = c.nextInt();
            }
        }
//        For Second Input;
        System.out.println("Enter the Second Matrix: ");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                b[i][j] = c.nextInt();
            }
        }
//        Displaying the output in form of a*b =
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Multiplies....");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
//        Multiplication Logic:
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<a[0].length;k++){
                    x[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Solution is:..........");
//        Solution for the multiplication
        for(int i=0;i<a.length;i++){
            for(int j=0;j<x[i].length;j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
}
