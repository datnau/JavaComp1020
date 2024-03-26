public class ObjectListTest {
    public static void main(String[] args) {
        IObjectList objList = new StringArrayList();
        objList.add("Hello World");
        objList.add(23);
        objList.add(7.07);

        try {
            System.out.println("Data from index 0: " + objList.get(0));
            System.out.println("Data from index 1: " + objList.get(1));
            System.out.println("Data from index 2: " + objList.get(2));
            System.out.println("Total size of the list: " + objList.size());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }
    }
}
