import java.util.*;
public class fibowithrecursion {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        System.out.println(fibo(n));
        for (int i = 0; i < 50; i++) {
            System.out.println(fibbowithgldnration(i));
        }
    }
    //with golden ratio
    private static int fibbowithgldnration(int n){
        return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
    private static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
