package practice;

public class whileRevNum {
    public static void main(String[] args) {
        int n = 987654;
        int a = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            a = (a*10)+rem;
        }
        System.out.println(a);
    }
}
