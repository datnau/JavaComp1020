public class LinkedList {
    // instance variable
    private Node top;

    // Constructor
    public LinkedList() {
        top = null;
    }

    //
    // Instance methods
    //

    // adding at the beginning
    public void add(Object newItem) {
        Node newNode = new Node(newItem, top);
        top = newNode;
    }

    // adding at a given position(not safe)
    public void add(int position, Object newItem) {
        if (position == 0) {
            add(newItem);
        }

        else {
            Node prev = top;
            for (int i = 0; i < position - 1; i++)
                prev = prev.getLink();
            Node newNode = new Node(newItem, prev.getLink());
            prev.setLink(newNode);

        }
    }

    // toString
    public String toString() {
        String answer = "<< ";
        Node current = top;
        while (current != null) {
            answer += current.getData() + " ";
            current = current.getLink();
        }
        return answer + ">>";
    }

}