
public class ObjectListWithLL implements IObjectList {
    private ObjectNode top;

    public ObjectListWithLL() {
        top = null;
    }

    public void add(Object obj) {
        ObjectNode newNode = new ObjectNode(obj);

        if (top == null) { // add at first
            top = newNode;
        } else {
            ObjectNode current = top;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Object get(int index) {
        ObjectNode current = top;
        int count = 0;

        while (current != null) {
            if (count == index) {
                return current.data;
            }
            current = current.next;
            count++;
        }

        throw new IndexOutOfBoundsException("Index out of range: " + index);
    }

    public void set(int index, Object obj) {
        ObjectNode current = top;
        int count = 0;

        while (current != null) {
            if (count == index) {
                current.data = obj;
                return;
            }
            current = current.next;
            count++;
        }

        throw new IndexOutOfBoundsException("Index out of range: " + index);
    }

    public int size() {
        int count = 0;
        ObjectNode current = top;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public void printList() { // print
        ObjectNode current = top;

        System.out.println("Linekd List of Objects are:");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

}
