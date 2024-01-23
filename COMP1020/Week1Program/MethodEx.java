import java.util.Scanner;

public class MethodEx {
    public static void main(String[] args) {
        String s = "Hello Java";
        printMessage(s);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = in.nextDouble();

        System.out.println("Enter b:");
        double b = in.nextDouble();
        in.close();

        int sum = sumOp((int) a, (int) b);
        int sub = subOp((int) a, (int) b);
        System.out.println("Sum is: " + sum);
        System.out.println("Subtract is: " + sub);
    }

    static void printMessage(String message) {
        System.out.println(message);
    }

    static int sumOp(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static int subOp(int a, int b) {
        int sub = a - b;
        return sub;
    }
}
