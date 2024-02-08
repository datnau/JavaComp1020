public class G_ExceptionDemo {
    public static void main(String[] args) {
        try {
            int num1 = 10, num2 = 0;

            int res = num1 / num2;
            System.out.println("Result: " + res);
        } catch (ArithmeticException ae) {

            System.out.println("Caught an exception from function: " + ae.getMessage());
        }
    }
}