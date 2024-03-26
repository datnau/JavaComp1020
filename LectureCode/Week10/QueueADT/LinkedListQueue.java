public class LinkedListQueue implements IQueue {
    Node head; // dequeue -> beginning of the queue
    Node tail; // enqueue -> end of the queue
    private final int CAPACITY;
    private int size;

    public LinkedListQueue(int CAPACITY) {
        head = null;
        tail = null;
        this.CAPACITY = CAPACITY;
        this.size = 0;
    }

    public void enqueue(Object data) {
        if (size < CAPACITY) {
            Node newNode = new Node(data, null);
            if (tail == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.setNext(newNode);
                tail = newNode;
            }
            size++;
        } else {
            System.out.println("The Queue is full");
        }
    }

    public Object dequeue() {
        if (head == null) {
            return null;
        }
        Node toRemove = head;
        head = head.getNext();
        size--;
        return toRemove.getData();
    }

    public Object peek() {
        if (head == null) {
            return null;
        }
        return head.getData();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return size == CAPACITY;
    }

    public String toString() {
        String toReturn = "<< ";
        Node curr = head;
        while (curr != null) {
            toReturn += curr.getData() + " ";
            curr = curr.getNext();
        }
        return toReturn + ">>";
    }
}
