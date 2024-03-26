public class StringReverser {

    public static String reverseString(String input) {
        Stack stack = new Stack();

        // Push each character of the input string onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters from the stack to construct the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reverseString(input));
    }
}
