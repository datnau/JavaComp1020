import java.util.ArrayList;

public class ExArrayList {
    public static void main(String[] args) {
        // creating an arraylist
        ArrayList<String> a = new ArrayList<String>();

        // adding to arraylist
        a.add("First");
        a.add("Second");
        a.add("Third");
        a.add(1, "Fourth");// insert
        System.out.println("Array after adding" + a);

        // size of arraylist
        System.out.println("Array size: " + a.size());

        // remove from arraylist
        a.remove(0);
        a.remove("Third");
        System.out.println("Array after remove: " + a);
        // get an element
        System.out.println("Element is: " + a.get(0));

        // set an element
        String ele = "Fifth";
        System.out.println("Changing an element: " + a.set(0, ele));
        System.out.println("Array is: " + a);

        // Finding the Index
        a.add("Fifth");
        System.out.println("Index of First:" + a.indexOf("First"));
        System.out.println(a);
        System.out.println("searches from the other end: " + a.lastIndexOf(ele));

        // contains
        System.out.println("Second is present or not? " + a.contains("Second"));

        // clear
        a.clear();
        System.out.println("Array after clear" + a);
    }
}
