package QuestionsBeginner;

public class revnumlog {
    public static void main(String[] args) {
        int n = 565;
        int a = rev(n);
        System.out.println(a);
       boolean b =  palin(n);
        System.out.println(b);
    }
    static int rev(int n){
        int x = (int)(Math.log10(n))+1;
        return helperr(n, x);
    }

    private static int helperr(int n, int digits) {
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10, digits-1)) + helperr(n/10, digits-1);
    }
    private static boolean palin(int n){
        return n == rev(n);
    }
}
