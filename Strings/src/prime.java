import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<=1){
            System.out.println("Neither prime Nor Composite");
            return;
        }
        int x = 0;
        for(int i=2;i<=a/2;i++) {
            if (a % i == 0) {
                x = 1;
                break;
            }
        }
            if(x == 0){
                System.out.println("it is a prime");
            }else{
                System.out.println("not a prime");
            }
        }
    }

