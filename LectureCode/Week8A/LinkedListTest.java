public class LinkedListTest {
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.add("Fred");
        ll.add(365);
        ll.add("last");
        ll.add(2, "adding");
        System.out.println(ll.toString());

    }

}
