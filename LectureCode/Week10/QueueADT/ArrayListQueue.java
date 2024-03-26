import java.util.ArrayList;

public class ArrayListQueue implements IQueue {

    private ArrayList<Object> queue;
    private int head;
    private int tail;
    private final int CAPACITY;

    public ArrayListQueue(int CAPACITY) {
        this.queue = new ArrayList<>();
        this.head = -1;
        this.tail = -1;
        this.CAPACITY = CAPACITY;
    }

    public void enqueue(Object data) {
        if (!isFull()) {
            if (isEmpty()) {
                head = 0;
            }
            tail = (tail + 1) % CAPACITY;
            queue.add(tail, data);

        } else {
            System.out.println("The Queue is full");
        }
    }

    public Object dequeue() {
        if (!isEmpty()) {
            Object toRemove = queue.get(head);
            if (head == tail) {
                head = -1;
                tail = -1;
            } else {
                head = (head + 1) % CAPACITY;
            }
            return toRemove;
        } else {
            System.out.println("Queue is empty.");
            return null;
        }
    }

    public Object peek() {
        if (!isEmpty()) {
            return queue.get(head);
        } else {
            System.out.println("Queue is empty.");
            return null;
        }
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public boolean isFull() {
        return (tail + 1) % CAPACITY == head;
    }
}
