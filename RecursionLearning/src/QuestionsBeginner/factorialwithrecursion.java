package QuestionsBeginner;

public class factorialwithrecursion {
    public static void main(String[] args) {
        int n = 5;
        int ans = factRecursion(n);
        System.out.println(ans  );
    }
    static int factRecursion(int n){
        if(n==0){
            return 1;
        }
        return (n*factRecursion(n-1));
    }
}
