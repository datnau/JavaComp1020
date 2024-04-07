package LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.add("Dog");
        LL.add("Cat");
        LL.add("Mouse");
        LL.add("Chicken");
        System.out.println("Linked List is");
        System.out.println(LL.toString());
        System.out.println("\nAdd ant at the 2nd position");
        LL.addPosition(1, "Ant");
        System.out.println(LL.toString());
        LL.remove("Cat");
        System.out.println("\nRemove Cat");
        System.out.println(LL.toString());
        LL.removeIndex(2);
        System.out.println("\nRemove 3rd position");
        System.out.println(LL.toString());

    }
}
