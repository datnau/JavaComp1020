import java.io.*;

public class K_CheckedException1 {
    public static void main(String[] args) {
        int i = 9 / 0;// unchecked
        System.out.println(i);
        try {
            FileReader file = new FileReader("file1.txt"); // checked

            file.close();

        } catch (IOException ex) {
            System.out.println("File not found");
        } catch (ArithmeticException ex) {
            System.out.println("Divide by zero");
        } finally {
            System.out.println("Hello ");
        }
    }
}
