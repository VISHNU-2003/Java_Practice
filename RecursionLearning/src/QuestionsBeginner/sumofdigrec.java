package QuestionsBeginner;

public class sumofdigrec {
    public static void main(String[] args) {
        int n = 1342;
        int a = sumdigi(n);
        System.out.println(a);
        //in general
//        int sum = 0;
//        for(;n>0;n/=10){
//            int rem = n%10;
//            sum += rem;
//        }
//        System.out.println(sum);
    }
    static int sumdigi(int n){
        if(n == 0){
            return 0;
        }
        return sumdigi(n/10) + (n%10);
    }
}
