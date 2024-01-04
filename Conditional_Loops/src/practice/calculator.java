package practice;

import java.sql.SQLOutput;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       CalculatingNum(a, b);
    }
    public static void CalculatingNum(int a, int b){
        int sum = a+b;
        int multi = a*b;
        int remainder = a%b;
        int quitoent = a/b;
        int subtraction = a-b;
        String result = ("sum is "+ sum + " "+"Multiplication is "+  multi + " " +"remainder is" + remainder + " " + "quitoent is "+ quitoent +" "+ "Subtraction is " + " " + subtraction);
        System.out.println(result);
    }
}
