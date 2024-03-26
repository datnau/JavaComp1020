public class StackTest {
    public static void main(String[] args) {
        IStackInterface stack = new StackLL(3);
        System.out.println("Is stack full? " + stack.isFull());
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());

        try {
            System.out.println("Peek: " + stack.peek());

            Object poppedEle = stack.pop();
            System.out.println("Popped element: " + poppedEle);

            System.out.println("Peek after pop: " + stack.peek());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
