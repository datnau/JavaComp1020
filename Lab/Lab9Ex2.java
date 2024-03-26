public class Lab9Ex2 {
  public static void main(String args[]) {
    System.out.println("Is 81 a power of three? " + isPowerOfThree(81));
    System.out.println("Is 30 a power of three? " + isPowerOfThree(30));
    System.out.println("Is 333 a power of three? " + isPowerOfThree(333));
    System.out.println("Is 1 a power of three? " + isPowerOfThree(1));
    System.out.println("Is 2657205 a power of three? " + isPowerOfThree(2657205));
    System.out.println("Is 14348907 a power of three? " + isPowerOfThree(14348907));

    System.out.println("\nEnd of processing.");
  }

  public static boolean isPowerOfThree(int n) {
    if (n <= 0) {
      return false; 
    }
    if (n == 1) {
      return true; // 1 is a power of three
    }
    // Recursive case
    return n % 3 == 0 && isPowerOfThree(n / 3);
  }
}
