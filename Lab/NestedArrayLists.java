import java.util.ArrayList;

public class NestedArrayLists {

    public static void main(String[] args) {
        // Set up some sort of nested ArrayList structure
        ArrayList<Object> test = new ArrayList<>();
        ArrayList<Object> one = new ArrayList<>();
        ArrayList<Object> two = new ArrayList<>();
        ArrayList<Object> three = new ArrayList<>();
        ArrayList<Object> four = new ArrayList<>();
        test.add(23);
        one.add(19);
        one.add(46);
        test.add(one);
        test.add("Hello");
        two.add(45.5);
        two.add("World");
        two.add(three);
        test.add(two);
        three.add(11);
        three.add(22);
        four.add(33);
        three.add(four);
        System.out.println("The nested ArrayList is: " + test);

        // Flatten it and print the result
        System.out.println("The flattened ArrayList is: " + flatten(test));
    }

    public static ArrayList<Object> flatten(ArrayList<Object> a) {
        ArrayList<Object> flattened = new ArrayList<>();
        for (Object element : a) {
            if (element instanceof ArrayList) {
                flattened.addAll(flatten((ArrayList<Object>) element));
            } else {
                flattened.add(element);
            }
        }
        return flattened;
    }
}
