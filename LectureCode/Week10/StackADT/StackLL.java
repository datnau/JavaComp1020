public class StackLL implements IStackInterface {

    private ObjectNode top;
    private int size;
    private final int CAPACITY;

    public StackLL(int CAPACITY) {
        this.top = null;
        this.size = 0;
        this.CAPACITY = CAPACITY;

    }

    public void push(Object obj) {
        if (!isFull()) {
            ObjectNode newNode = new ObjectNode(obj);
            newNode.next = top;
            top = newNode;
            size++;
        } else {
            System.out.println("Stack is full.");
        }
    }

    public Object pop() {
        if (!isEmpty()) {
            Object data = top.data;
            top = top.next;
            size--;
            return data;
        } else {
            System.out.println("Stack is empty. Cannot pop element.");
            return null;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == CAPACITY;
    }

    public Object peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return null;
        }
    }
}
