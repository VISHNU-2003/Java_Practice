package QuestionsBeginner;

public class checkpalinrec {
    public static void main(String[] args) {
        int n = 969;
//        int a = rev(n);
//        System.out.println(a);
        boolean x = checkpaliins(n);
        System.out.println(x);
    }
    private static int rev(int n){
        int d = (int)(Math.log10(n)) + 1;
        return helperss(n, d);
    }

    private static int helperss(int n, int digits) {
        if(n%10 == 0){
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10, digits-1)) + helperss(n/10, digits-1);
    }
    private static boolean checkpaliins(int n){
        return n == rev(n);
    }

}
