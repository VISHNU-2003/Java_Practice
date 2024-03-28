public class Helloworld5 {
    public static void main(String[] args) {
        message();
    }

    private static void message() {
        System.out.println("Hellow world");
        message1();
    }

    private static void message1() {
        System.out.println("Hellow world");
        message2();
    }

    private static void message2() {
        System.out.println("Hellow world");
        message3();
    }

    private static void message3() {
        System.out.println("Hellow world");
        message4();
    }

    private static void message4() {
        System.out.println("Hellow world");
    }
}
//import java.util.*;
//class abc{
//    public static void main(String[] args){
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int a = 0;
//        int b = 1;
//        System.out.print(a + " ");
//        System.out.print(b + " ");
//        for(int i=2; i<=n; i++){
//            int temp = b;
//            b = b+a;
//            a = temp;
//            System.out.print(b + " ");
//        }
//    }
//}