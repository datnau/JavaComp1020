package Excepion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    static char[] arr = new char[100];

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader(
                    "C:\\Users\\ADMIN\\OneDrive - EECD EDPE\\Documents\\JavaComp1020\\PracticeCode\\Excepion\\data1.txt");
            reader.read(arr);
            System.out.println(String.valueOf(arr));
            reader.close();
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            e.printStackTrace(); // Consider logging or informing the user
        } catch (IOException e) {
            // Handle IO exception
            e.printStackTrace(); // Consider logging or informing the user
        }
    }
}
