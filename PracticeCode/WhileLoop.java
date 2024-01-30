import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        // The while loop will continue as long as the entered name is blank (empty or
        // contains only whitespace).
        while (name.isEmpty()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }

        // Once a non-blank name is provided, the loop will exit, and this line will be
        // executed.

        System.out.println("Hello " + name);
        scanner.close();
    }
}
