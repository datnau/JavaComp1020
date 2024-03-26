public class StackArray implements IStackInterface {
    private Object[] elements;
    private int top;
    private final int CAPACITY;

    public StackArray(int CAPACITY) {
        elements = new Object[CAPACITY];
        top = -1;
        this.CAPACITY = CAPACITY;
    }

    public void push(Object obj) {
        if (top == elements.length - 1) {
            System.out.println("Stack is full!");
        }
        elements[++top] = obj;
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        }
        return elements[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == CAPACITY - 1;
    }

    public Object peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        }
        return elements[top];
    }

}
