/**
 * Demonstrate a factorial function
 * The factorial function (symbol: !) says to multiply
 * all whole numbers from our chosen number down to 1.
 * Examples:
 * 4! = 4 × 3 × 2 × 1 = 24
 * 7! = 7 × 6 × 5 × 4 × 3 × 2 × 1 = 5040
 * 1! = 1
 * 0! = 1
 */

public class B_FactorialRec {

	public static void main(String[] args) {
		int i = 5;

		System.out.println("Factorial Recursive version:" + factRec(i));

	}

	// Recursive approach
	public static long factRec(int n) {
		if (n == 1 || n == 0)
			return 1;
		return n * factRec(n - 1);
	}
}