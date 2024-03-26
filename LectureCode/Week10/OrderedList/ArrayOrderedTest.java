
public class ArrayOrderedTest {
    public static void main(String[] args) {
        IOrderedList orderedList = new ArrayListForOrderedList();

        orderedList.insert(32);
        orderedList.insert(42);
        orderedList.insert(12);
        orderedList.insert(22);

        System.out.println("Ordered List:");
        for (int i = 0; i < orderedList.size(); i++) {
            System.out.print(orderedList.get(i) + "\t");
        }
        System.out.println("\n");

        Comparable obj = 22;
        int index = orderedList.find(obj);
        if (index != -1) {
            System.out.println("Object " + obj + " found " + " at index " + index);
        } else {
            System.out.println("Object " + obj + " not found");
        }
        System.out.println("Size of Original Ordered List is:" + orderedList.size() + "\n");
        obj = 14;
        index = orderedList.find(obj);
        if (index != -1) {
            System.out.println("Object " + obj + " found " + " at index " + index);
        } else {
            System.out.println("Object " + obj + " not found");
        }

        orderedList.remove(1);
        System.out.println("Size of new Ordered List is:" + orderedList.size() + "\n");
        System.out.println("New Ordered List:");
        for (int i = 0; i < orderedList.size(); i++) {
            System.out.print(orderedList.get(i) + "\t");
        }
        System.out.println("\n");
    }
}
