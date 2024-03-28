package QuestionsBeginner;

public class factorialwithoutrecursion {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            fact(i);
        }
    }
    static void fact(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f*i;
        }
        System.out.print(f + " ");
    }
}
