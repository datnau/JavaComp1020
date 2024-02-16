import java.io.FileWriter;
import java.io.IOException;

public class MulTable {
    public static void main(String[] args) {
        int number = 2;
        int limit = 5;
        try {
            FileWriter writer = new FileWriter("MulTable.txt");
            for (int i = 1; i <= limit; i++) {
                int result = number * i;
                String line = number + " * " + i + " = " + result + "\n";
                writer.write(line);
            }
            writer.close();
            System.out.println("Multiplication table for " + number + " has been written to MulTable.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
