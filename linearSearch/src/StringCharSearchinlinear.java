import java.lang.reflect.Array;
import java.util.*;
public class StringCharSearchinlinear {
    public static void main(String[] args) {
        String s = "Vishnu";
        char target = 'i';
        System.out.println(akay(s, target));
//        System.out.println(Array.toString(s.toCharArray(akay(s, tar))));
    }
    static int akay(String str, char x){
        if(str.length() == 0){
            return -1;
        }
        for(int i =0;i<str.length();i++){
            char y = str.charAt(i);
            if(y==x){
                return i;
            }
        }
        return -1;
    }
}
