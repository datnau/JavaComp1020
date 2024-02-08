import java.io.*;

public class M_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        // try {

        FileReader file = new FileReader("file1.txt");
        throw new FileNotFoundException("No such file");
        // file.close();

        // int i = 9 / 0;
        // System.out.println(i);

        // } catch (IOException ex) {
        // System.out.println("File not found");
        // }
    }

}
