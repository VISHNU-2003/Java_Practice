import java.util.*;
public class first {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        System.out.println(list);
        list.set(3,14);
        System.out.println(list);
//        list.contains(33);
        System.out.println(list.contains(33));
    }
}
