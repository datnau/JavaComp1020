import java.util.*;

public class Q1Output {
    public static void main(String args[]) {
        ArrayList<String> myArrList = new ArrayList<String>();
        String p1 = new String("John");
        String p2 = new String("Fred");
        myArrList.add(p1);
        myArrList.add(p2);
        myArrList.add(p2);
        myArrList.add(p1);
        myArrList.add(p1);
        myArrList.add(p2);
        myArrList.add(p1);
        myArrList.add(p2);
        myArrList.add(p1);
        System.out.println(myArrList.contains(new String("John")));
        System.out.println(myArrList.contains(p1));
        System.out.println(myArrList.indexOf(new String("Jane")));
        System.out.println(myArrList.indexOf(p2));
        System.out.println(myArrList.lastIndexOf(new String("Fred")));
        System.out.println(myArrList.lastIndexOf(p2));
    }
}