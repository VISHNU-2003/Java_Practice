import java.util.*;
public class ReverseInt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int x = sc.nextInt();
        System.out.println(ReverseInt(n));
    }
    public static int ReverseInt(int n){
        int count = 0;
        for(;n>0;n/=10){
            int rem = n%10;
             count = (count*10) + rem;
        }
        return count;
    }
}
