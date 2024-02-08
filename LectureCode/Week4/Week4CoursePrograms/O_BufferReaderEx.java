import java.io.*;
import java.util.*;

public class O_BufferReaderEx {
    public static void main(String[] args) {
        try {
            // FileReader fr = new FileReader("file1.txt");
            BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
            Scanner sc = new Scanner(br.readLine());
            while (sc.hasNext()) {
                String data = sc.next();
                System.out.println(data);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("A file error occurred.");

        }
    }
}
