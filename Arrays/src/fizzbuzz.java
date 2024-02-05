import java.util.*;
public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Arrays.toString(fizzBuz(n)));
    }
    public static String[] fizzBuz(int n){
        String[] N = new String[n];
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5 == 0){
                N[i-1] = "FizzBuzz";
            }else if(i%3 == 0){
                N[i-1] = "Fizz";
            }else if(i%5 ==0){
                N[i-1] = "Buzz";
            }else{
                N[i-1] = Integer.toString(i);
            }
        }
        return N;
    }
}
