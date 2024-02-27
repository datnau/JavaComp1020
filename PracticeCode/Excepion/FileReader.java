package Excepion;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileReader {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("hello.txt"));
            writer.write("Writing to a file");
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
