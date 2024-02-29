import java.util.*;
public class NUmOccurances {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the digit to count:");
        int s = sc.nextInt();
        System.out.println("The digit " + s + " occurs " + occ(n, s) + " times in the number " + n);
    }
    public static int occ(int n, int s){
        int count = 0;
        for(; n>0; n/=10){
            int rem = n%10;
            if(rem == s)
                count++;
        }
        return count;
    }
}
