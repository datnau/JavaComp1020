import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab6Ex1 {
  public static final int MAX_INTEGERS = 10; // Reduced size to 10

  public static void main(String[] args) {
    int[] numbers = new int[MAX_INTEGERS];
    int numbersSize = 0;
    String FILE_NAME = "numbers1.txt"; // Moved to main

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
    int number, pos = 0;

    try {
      in = new Scanner(new FileReader(filename));
      while (in.hasNextLine() && pos < numbers.length) { // Check array bounds
        number = in.nextInt();
        numbers[pos] = number;
        pos++;
      }
    } catch (FileNotFoundException fnf) {
      System.out.println(fnf);
      pos = -1;
    }

    return pos; // Return the actual size of the array
  }

  public static void printNumbers(int[] numbers, int size) {
    System.out.print("[ ");
    for (int i = 0; i < size; i++)
      System.out.print(numbers[i] + " ");
    System.out.println("]");
  }
}
