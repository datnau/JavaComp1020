import java.io.*;
import java.util.*;

public class P_BufferReaderEx {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("file2.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            if (line != null) {
                Scanner in = new Scanner(line);
                double dNumber = in.nextDouble();
                String personName = in.next();
                boolean flagValue = in.nextBoolean();
                int iNumber = in.nextInt();

                System.out.println("Number: " + dNumber);
                System.out.println("Name: " + personName);
                System.out.println("Flag: " + flagValue);
                System.out.println("Value: " + iNumber);

                in.close();
                br.close();
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

    }
}