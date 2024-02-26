import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Lab6Ex1_3 {
  public static final int MAX_INTEGERS = 20;
  public static String FILE_NAME = "output.txt"; // Output filename

  public static void main(String[] args) {
    int[] numbers = new int[MAX_INTEGERS];
    int numbersSize = 0;

    numbersSize = readNumbersToArray("numbers1.txt", numbers); // Read numbers1.txt

    if (numbersSize < 0) {
      System.out.println("No array was read.");
    } else {
      System.out.println("The following array was read:");
      printNumbers(numbers, numbersSize);
      String outputFileName = getInputFileName();
      writeNumbersToFile(outputFileName, numbers, numbersSize);
      System.out.println("Numbers written to file: " + outputFileName);
    }

    System.out.println("\n*** End of program. ***");
  }

  public static int readNumbersToArray(String filename, int[] numbers) {
    Scanner in;
    int pos = 0;

    try {
      in = new Scanner(new FileReader(filename));
      while (in.hasNextLine() && pos < numbers.length) {
        String line = in.nextLine();
        String[] tokens = line.split(",");
        for (String token : tokens) {
          try {
            numbers[pos] = Integer.parseInt(token.trim());
            pos++;
          } catch (NumberFormatException e) {
            System.out.println("Error parsing integer: " + token);
          }
        }
      }
    } catch (FileNotFoundException fnf) {
      System.out.println(fnf);
      pos = -1;
    }

    return pos;
  }

  public static void printNumbers(int[] numbers, int size) {
    System.out.print("[ ");
    for (int i = 0; i < size; i++)
      System.out.print(numbers[i] + " ");
    System.out.println("]");
  }

  public static String getInputFileName() {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter output file name: ");
      return scanner.nextLine().trim();
    }
  }

  public static void writeNumbersToFile(String filename, int[] numbers, int size) {
    try (FileWriter writer = new FileWriter(filename)) {
      for (int i = 0; i < size; i++) {
        writer.write(Integer.toString(numbers[i]));
        if (i < size - 1) {
          writer.write(",");
        } else {
          writer.write("\n");
        }
      }
    } catch (IOException e) {
      System.out.println("Error writing to file: " + filename);
    }
  }
}
