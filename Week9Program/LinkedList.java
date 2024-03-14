public class LinkedList {
    // instance variable
    Node top;

    public LinkedList() {
        top = null;
    }

    // method to add a node at the beginning of the linked list
    public void add(Object newItem) {
        Node newNode = new Node(newItem, top);
        top = newNode;
    }

    // method to add a node at the end of the linked list
    public void addToEnd(Object newItem) {
        if (top == null) {
            top = new Node(newItem, null);
            return;
        }
        Node current = top;
        while (current.getLink() != null) {
            current = current.getLink();
        }
        current.setLink(new Node(newItem, null));
    }

    // method to count the number of nodes in the linked list
    public int countNodes() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.getLink();
        }
        return count;
    }

    // method to multiply every element of the linked list with 10
    public void multiplyBy10() {
        // Node current = top;
        // while (current != null) {

        // current = current.getLink();
        // BNCCCC }
    }

    // method to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = top;
        Node next = null;
        while (current != null) {
            next = current.getLink();
            current.setLink(prev);
            prev = current;
            current = next;
        }
        top = prev;
    }

    public void removeLast() {
        if (top == null || top.getLink() == null) {
            top = null;
            return;
        }
        Node current = top;
        while (current.getLink().getLink() != null) {
            current = current.getLink();
        }
        current.setLink(null);
    }

    public void circularConverted() {
        if (top == null) {
            return;
        }
        Node current = top;
        while (current.getLink() != null) {
            current = current.getLink();
        }
        current.setLink(top);
    }

    public void printCircular() {
        if (top == null) {
            return;
        }
        Node current = top;
        do {
            System.out.print(current.getData() + " ");
            current = current.getLink();
        } while (current != top);
        System.out.println();
    }

    // method to print the linked list
    public String toString() {
        String answer = "";
        Node current = top;
        while (current != null) {
            answer += current.getData() + " ";
            current = current.getLink();
        }
        return answer + ">>";
    }
}
