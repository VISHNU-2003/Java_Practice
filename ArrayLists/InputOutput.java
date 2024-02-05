import java.util.*;
import java.util.ArrayList;
//import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creating the ArrayList;
        ArrayList<Integer> list = new ArrayList<>();
        //Input;
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        //get item at any index Output
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));//passes index here, List[index] Syntax will now work here directly.
        }
    }
}
