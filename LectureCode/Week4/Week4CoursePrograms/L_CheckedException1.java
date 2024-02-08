import java.io.*;

public class L_CheckedException1 {
    public static void main(String[] args) {
        try {

            FileReader file = new FileReader("file1.txt"); // checked

            file.close();

            int i = 9 / 0;// unchecked
            System.out.println(i);

        } catch (IOException ex) {
            System.out.println("File not found");
        }
    }

}
