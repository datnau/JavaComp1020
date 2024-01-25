import java.util.*;

public class FixErrorArray {
    public static void main(String[] args) {
        ArrayList<String> myArr = new ArrayList<String>();
        String one = "One";
        String two = new String("Two");
        myArr.add(two);
        myArr.add(one);
        ArrayList<String> otherArr = myArr;
        otherArr.add("Three");
        for (String val : myArr)
            System.out.print(val + "->");
        System.out.println();
        for (String val : otherArr)
            System.out.print(val + "->");
    }
}
