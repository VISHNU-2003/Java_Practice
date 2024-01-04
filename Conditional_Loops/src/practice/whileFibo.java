package practice;

public class whileFibo {
    public static void main(String[] args) {
        int n = 8;
        int a = 0;
        int b = 1;
        int i = 2;
        while(i<=n){
            int temp = b;
            b = b+a;
            a = temp;
            i++;
        }
        System.out.println(b);
    }
}
