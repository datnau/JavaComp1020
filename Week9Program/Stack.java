import java.util.ArrayList;

public class Stack {

    private ArrayList<Object> stack;

    // Constructor
    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(Object obj) {
        stack.add(obj);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}
