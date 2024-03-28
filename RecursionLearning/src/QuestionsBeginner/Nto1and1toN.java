package QuestionsBeginner;

public class Nto1and1toN {
    public static void main(String[] args) {
        funorgnrev(5);
    }
    static void funorgnrev(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        funorgnrev(n-1);
        System.out.print(n + " ");
    }
}
