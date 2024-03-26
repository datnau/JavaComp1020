public class ObjectList {
    private Node top;

    // Constructor
    public ObjectList() {
        top = null;
    }

    public void add(Object obj) {
        Node newNode = new Node(obj, top);
        top = newNode;
    }

    public int indexOf(Object obj) {
        Node current = top;
        int index = 0;

        while (current != null) {
            if (obj == null && current.getData() == null) {
                return index;
            }
            current = current.getLink();
            index++;
        }

        return -1;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public void clear() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }
}