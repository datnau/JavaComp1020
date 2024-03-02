package Excepion;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader(
                    "C:\\Users\\ADMIN\\OneDrive - EECD EDPE\\Documents\\JavaComp1020\\PracticeCode\\Excepion\\data1.txt");
            BufferedReader br = new BufferedReader(file);
            String line = br.readLine();
            System.out.println(line);
            // Process the read line here

            br.close(); // Don't forget to close the BufferedReader
        } catch (Exception e) {
            System.out.println("Error occurred while reading the file: " + e.getMessage());
        }
    }
}
