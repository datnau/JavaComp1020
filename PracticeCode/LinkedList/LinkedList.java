package LinkedList;

public class LinkedList {

    private Node top;

    public LinkedList() {
        top = null;
    }

    public void add(Object newItem) {
        Node newNode = new Node(newItem, top);
        top = newNode;
    }

    public void addPosition(int pos, Object newItem) {
        if (pos == 0) {
            add(newItem);
            return;
        }
        Node prev = getNode(pos - 1);
        if (prev == null) {
            throw new IndexOutOfBoundsException("Cannot add at position" + pos);
        } else {
            Node newNode = new Node(newItem, prev.getLink());
            prev.setLink(newNode);
        }
    }

    private Node getNode(int n) {
        Node current = top;
        while (n > 0 && current != null) {
            current = current.getLink();
            n--;
        }
        return current;
    }

    public void remove(Object key) {
        Node prev = null;
        Node current = top;
        while (current != null && !current.getData().equals(key)) {
            prev = current;
            current = current.getLink();
        }
        if (current == null) {
            return;
        }
        if (prev == null) {
            top = current.getLink();
        } else {
            prev.setLink(current.getLink());
        }
    }

    public void removeIndex(int n) {
        if (n == 0) { // Removing the first node
            if (top != null) { // Making it safe, in case the list is empty!
                top = top.getLink();
            }
        } else {
            Node prev = getNode(n - 1);
            if (prev != null && prev.getLink() != null) { // Otherwise, nothing to remove!
                prev.setLink(prev.getLink().getLink()); // Skipping over
            }
        }
    }

    public String toString() {
        String answer = "<<";
        Node current = top;
        while (current != null) {
            answer += current.getData() + " ";
            current = current.getLink();
        }
        return answer + ">>";
    }

    // Other methods to manipulate the linked list can be added here
}
