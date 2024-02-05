import java.util.*;
public class multiplication_of_matrix {
    public static void main(String[] args){
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        Scanner sc = new Scanner(System.in);
        //input
        System.out.println("Enter the first matrix: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Second Matrix: ");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                b[i][j] = sc.nextInt();
            }
        }
        //multiplication of two matrix
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<a[0].length;k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        //output
        for(int i=0;i<a.length;i++){
            for(int j=0;j<c[i].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
