import java.io.IOException;

public class L_CheckedExceptionsCatch {
    public static void main(String[] args) {
        try {
            int result = funWithCatch();
            System.out.println("Result: " + result);
        } catch (IOException e) {
            System.out.println("Caught IOException in the main method: " + e.getMessage());
        }
    }

    public static int funWithCatch() throws IOException {

        System.out.println("Inside funWithCatch");

        try {

            readFile();
        } catch (IOException e) {
            System.out.println("Caught IOException in funWithCatch: " + e.getMessage());

            throw e;
        }

        return 42;
    }

    public static void readFile() throws IOException {

        // System.out.println("Reading file...");
        throw new IOException("File not found");
    }
}
