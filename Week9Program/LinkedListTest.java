public class LinkedListTest {

    public static void main(String[] args) {
        ObjectList list = new LinkedList();
        list.add(24);
        list.add(365);
        list.add(12);
        list.addToEnd(4);
        System.out.println("\nOriginal List:");
        System.out.println(list);

        // list.multiplyBy10();
        // System.out.println("\nAfter Multiplying by 10:");
        // System.out.println(list);

        list.reverse();
        System.out.println("\nReversed List:");
        System.out.println(list);

        list.removeLast();
        System.out.println("\nAfter removing last element:");
        System.out.println(list);

        System.out.println("\nOutput for function");
        fun(list);

        list.circularConverted();
        System.out.println("\nCircular Linked List:");
        list.printCircular();

    }

    public static void fun(LinkedList list) {
        Node current = list.top;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getLink();
            if (current != null) {
                current = current.getLink();
            }
        }
        System.out.println();
    }
}