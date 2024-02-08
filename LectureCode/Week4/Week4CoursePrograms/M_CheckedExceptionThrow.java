
import java.io.FileReader;
import java.io.IOException;

public class M_CheckedExceptionThrow {
    public static void main(String[] args) {
        try {
            int result = funWithThrows();
            System.out.println("Result: " + result);
        } catch (IOException e) {
            System.out.println("IOException details in the main method: " + e.getMessage());
        }
    }

    public static int funWithThrows() throws IOException {

        System.out.println("Inside funWithThrows");

        readFile();

        return 42;
    }

    // Method 1: try-catch
    // public static void readFile() {

    // System.out.println("In Read File...");
    // try {
    // FileReader f = new FileReader("Hello.txt");
    // f.close();
    // } catch (IOException e) {
    // System.out.println("File not found");
    // }

    // }

    // Method 2: throws
    public static void readFile() throws IOException {

        FileReader f = new FileReader("Hello.txt");
        f.close();
        throw new IOException("File not found");
    }

}
