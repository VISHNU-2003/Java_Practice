package QuestionsBeginner;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class leetcode1342 {
    public static void main(String[] args) {
        System.out.println(numtozero(41));
    }
    private static int numtozero(int n){
        return help(n, 0);
    }

    private static int help(int n, int x) {
        if(n == 0){
            return x;
        }
        if(n%2 == 0){
            return help(n/2, x+1);
        }
        return help(n-1, x+1);
    }
}
