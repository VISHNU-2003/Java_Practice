import java.util.*;
public class Stringlimit {
    public static void main(String[] args){
        String series = "";
        for(int i=0;i<26;i++){
            char ch = (char)('A' + i);
            series = series + ch;
        }
        System.out.println(series);
        String a = "";
        for (int i=0;i<26;i++){
            char x = (char)('a'+i);
            a = a+x;
        }
        System.out.println(a);
        //printing reverse
        for(int i=a.length()-1; i>=0; i--){
        System.out.print(a.charAt(i));
    }
}
