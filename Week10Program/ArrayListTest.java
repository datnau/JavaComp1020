public class ArrayListTest {
    public static void main(String[] args) {
        // Test ArrayClass
        System.out.println("ArrayClass before deleting element:");
        IData array = new ArrayClass(5);
        array.addElement(1);
        array.addElement(2);
        array.addElement(3);
        array.displayElements();
        array.removeElement(2);
        System.out.println("ArrayClass after deleting element:");
        array.displayElements();

        // Test ArrayListClass
        System.out.println("\nArrayListClass before deleting element:");
        array = new ArrayListClass();
        array.addElement(9);
        array.addElement(8);
        array.addElement(7);
        array.displayElements();
        System.out.println("ArrayClass after deleting element:");
        array.removeElement(1);
        array.displayElements();
    }
}
