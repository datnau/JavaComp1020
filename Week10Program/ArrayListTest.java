public class ArrayListTest {
    public static void main(String[] args) {
        // Test ArrayClass
        System.out.println("Testing ArrayClass:");
        DataClass arrayClass = new ArrayClass(5);
        arrayClass.addElement(1);
        arrayClass.addElement(2);
        arrayClass.addElement(3);
        arrayClass.displayElements();
        arrayClass.removeElement(2);
        arrayClass.displayElements();

        // Test ArrayListClass
        System.out.println("\nTesting ArrayListClass:");
        DataClass arrayListClass = new ArrayListClass();
        arrayListClass.addElement(4);
        arrayListClass.addElement(5);
        arrayListClass.addElement(6);
        arrayListClass.displayElements();
        arrayListClass.removeElement(5);
        arrayListClass.displayElements();
    }
}
