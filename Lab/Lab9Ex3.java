public class Lab9Ex3 {
  public static void main(String args[]) {
    printTriangle("*", 9);

    System.out.println("\nEnd of processing.");
  }

  public static void printTriangle(String text, int depth) {
    String line = "";
    int count;

    for (count = 1; count <= depth; count++) {
      line += text;
      System.out.println(line);
    }
  }
}
