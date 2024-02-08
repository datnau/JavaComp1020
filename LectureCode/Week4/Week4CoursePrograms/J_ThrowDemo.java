public class J_ThrowDemo {
    static void divideFunc() throws ArithmeticException {
        int a = 5;

        if (a % 2 != 0) {
            throw new ArithmeticException("Sorry cannot have odd numbers");
        } else {
            System.out.println("Perfect!!! its an even number");
        }
    }

    public static void main(String[] args) {
        try {
            divideFunc();
        } catch (ArithmeticException ae) {
            System.out.println("In main: " + ae.getMessage());

        }
    }
}
