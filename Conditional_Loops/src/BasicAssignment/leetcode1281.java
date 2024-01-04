package BasicAssignment;
import java.util.Scanner;
//subtract the product and sum of the digits of a number.
public class leetcode1281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int product = ProductOfDigits(n);
        int sum = SumOfDigits(n);
        int reslut = product-sum;
        System.out.println("result of product-sum is: " + reslut);
    }
    public static int ProductOfDigits(int num){
        int product = 1;
        for(;num!=0;num/=10){
            int digit = num%10;
            product = product*digit;
        }
        return product;
    }
    public static int SumOfDigits(int num){
        int Sum = 0;
        for(;num!=0;num/=10){
            int digit = num%10;
            Sum = Sum+digit;
        }
        return Sum;
    }
}
