package practice;

public class revNum {
    public static void main(String[] args) {
        int n = 8989;
        int b = 0;
        for(;n>0;n/=10){
            int rem = n%10;
            b = (b*10)+rem;
        }
        System.out.println(b);
    }
}
