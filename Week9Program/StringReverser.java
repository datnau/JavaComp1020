public class StringReverser {

    public static String reverseString(String input) {
        Stack stack = new Stack();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("String before reversed: " + input);
        System.out.println("String after revered: " + reverseString(input));
    }
}
