public class ObjectListTest {
    public static void main(String[] args) {
        testIndexOf();
        testContains();
        testClear();
    }

    public static void testIndexOf() {
        ObjectList list = new ObjectList();
        Object obj1 = new Object();
        Object obj2 = new Object();

        list.add(obj1);
        list.add(obj2);
        System.out.println("Index of obj1: " + list.indexOf(obj1));
        System.out.println("Index of obj2: " + list.indexOf(obj2));
        System.out.println("Index of new Object: " + list.indexOf(new Object()));
        System.out.println();
    }

    public static void testContains() {
        ObjectList list = new ObjectList();
        Object obj1 = new Object();
        Object obj2 = new Object();

        list.add(obj1);
        list.add(obj2);

        System.out.println("Test Contains:");
        System.out.println("Contains obj1: " + list.contains(obj1));
        System.out.println("Contains obj2: " + list.contains(obj2));
        System.out.println("Contains new Object: " + list.contains(new Object()));
        System.out.println();
    }

    public static void testClear() {
        ObjectList list = new ObjectList();
        Object obj1 = new Object();
        Object obj2 = new Object();

        list.add(obj1);
        list.add(obj2);

        System.out.println("Test Clear:");
        System.out.println("Before clearing, list is empty: " + list.isEmpty());
        list.clear();
        System.out.println("After clearing, list is empty: " + list.isEmpty());
    }
}
