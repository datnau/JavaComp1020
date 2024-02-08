import java.io.*;

public class N_FileReaderEx {
    public static void main(String[] args) {

        char[] arr = new char[100];

        try {

            FileReader fr = new FileReader("file1.txt");

            fr.read(arr);
            System.out.println("Reading from file1..... ");
            System.out.println(arr);

            fr.close();
        }

        catch (Exception e) {
            System.out.println("File not found!");
        }
    }
}
