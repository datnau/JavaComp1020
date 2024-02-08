import java.io.*;

public class Q_FileWriter {
    public static void main(String[] args) {

        String str = "Adding another statement.";

        try {
            FileWriter fr = new FileWriter("file1.txt", true);
            PrintWriter pr = new PrintWriter(fr);

            pr.print(str);
            pr.close();
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }

    }
}
