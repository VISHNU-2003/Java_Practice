import java.util.*;
public class primewithBoolean {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<=1){
            System.out.println("Neither Prime Nor Composite");
            return;
        }
        boolean isPrime = true;
        for(int i=2; i<= a/2; i++){
            if(a%2 == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(a + " It is a prime number");
        }else {
            System.out.println(a + " Not a prime");
        }
    }
}
