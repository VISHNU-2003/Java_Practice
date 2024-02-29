import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Taking input string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Converting string to character array
        char[] charArray = inputString.toCharArray();

        // Outputting character array
        System.out.print("Character array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}
