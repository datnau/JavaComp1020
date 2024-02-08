public class G_ExceptionDemo1 {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println("String length is:" + s.length());
        }

        catch (NullPointerException e) {
            System.out.println("Sorry wrong input");

        }

        catch (ArithmeticException e) {
            System.out.println("May not be required here");
        }

        finally {
            System.out.println("In finally block");
        }

    }

}
