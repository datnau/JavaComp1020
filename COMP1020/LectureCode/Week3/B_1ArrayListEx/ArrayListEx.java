import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("First");
        a.add("Second");
        a.add(1, "Third");
        a.remove(0);
        System.out.println(a.get(0));
        System.out.println(a.indexOf("First"));
        System.out.println(a);

    }
}
