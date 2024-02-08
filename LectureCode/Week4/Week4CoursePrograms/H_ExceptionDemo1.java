public class H_ExceptionDemo1 {

    public static void main(String[] args) {
        try {
            int num1 = 10, num2 = 2;

            int res = divide(num1, num2);
            System.out.println("Result: " + res);
        } catch (ArithmeticException ae) {

            System.out.println("Caught an exception from function: " + ae.getMessage());
        }
    }

    // A method that may throw an exception
    private static int divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {

            throw new ArithmeticException("Denominator cannot be zero");
        }
        return numerator / denominator;
    }
}
