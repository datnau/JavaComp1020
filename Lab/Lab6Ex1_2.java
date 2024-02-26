import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab6Ex1_2 {
  public static final int MAX_INTEGERS = 20;
  public static String FILE_NAME = "numbers2.txt"; // Use numbers2.txt

  public static void main(String[] args) {
    int[] numbers = new int[MAX_INTEGERS];
    int numbersSize = 0;

    numbersSize = readNumbersToArray(FILE_NAME, numbers);

    if (numbersSize < 0) {
      System.out.println("No array was read.");
    } else {
      System.out.println("The following array was read:");
      printNumbers(numbers, numbersSize);
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
}
