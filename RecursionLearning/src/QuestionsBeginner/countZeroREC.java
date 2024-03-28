package QuestionsBeginner;

public class countZeroREC {
    public static void main(String[] args) {
        System.out.println(count(700980));
    }
    static int count(int n){
        return helpers(n,0);
    }
    //spcial pattern how to pass a value to above calls

    private static int helpers(int n, int x) {
        if(n == 0){
            return x;
        }
        int rem = n%10;
        if(rem == 0){
            return helpers(n/10, x+1);
        }
        return helpers(n/10, x);
    }
}
