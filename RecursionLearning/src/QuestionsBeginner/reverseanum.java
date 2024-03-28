package QuestionsBeginner;

public class reverseanum {
    public static void main(String[] args) {
        int n = 56789;
        //normal way
        func(n);
        System.out.println(count);
        int a = rev3(n);
        System.out.println(a);
        int count = 0;
        for(;n>0;n/=10) {
            int rem = n % 10;
            count = count * 10 + rem;
        }
        System.out.println(count);
    }
    //way 2.
    static int count = 0;
    static void func(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        count = count*10+rem;
        func(n/10);
    }
//    way 3 main recurssion
    private static int rev3(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
}
