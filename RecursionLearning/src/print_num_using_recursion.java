public class print_num_using_recursion {
    public static void main(String[] args) {
        printnum(1);
    }

     static void printnum(int n) {
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        printnum(n+1);
    }
}
