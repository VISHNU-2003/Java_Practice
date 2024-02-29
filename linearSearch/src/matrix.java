import java.util.*;
public class matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements in of size 9 ");
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("here is the array you have taken");
        System.out.println(Arrays.deepToString(arr));
        //inputting second matrix
        int[][] arr1 = new int[3][3];
        System.out.println("Enter the second elements of matrix");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("The second matrix" + Arrays.deepToString(arr1));
        //logic for multiplication
        int[][] arr2 = new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                for (int k=0;k<arr[0].length;k++){
                    arr2[i][j] += arr[i][k]*arr[j][k];
                }
            }
        }
        System.out.println("Solution is ....");
        System.out.println("The result of matrix multiplication is:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }
    }
}
