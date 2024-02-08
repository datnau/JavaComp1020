public class Q1Week5 {
    public static void main(String[] args) {
        try {
            System.out.println("Entered the try block.");
            int sum = 15 / 0;
            System.out.println(sum);
            System.out.println("Still in try block.");
        } catch (ArithmeticException e) {
            System.out.println("Sorry cannot divide by Zero.");
        } catch (Exception e) {
            System.out.println("An exception has occurred.");
        } finally {
            System.out.println("In finally block.");
        }
    }

}
