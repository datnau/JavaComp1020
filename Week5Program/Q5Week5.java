public class Q5Week5 {
    public static void main(String[] args) {
        int a = 8, b = 3, c = 2, d = 1;
        try {
            int result = a / (b - c + d);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("The arithematic exception caught.");
        } finally {
            System.out.println("It is the finally block");
        }
    }
}