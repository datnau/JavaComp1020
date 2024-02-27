
/**
 * Demonstrates that a simple recursion approach is *NOT* the
 * right way to calculate a fibonacci number!
 * Then we see a better way to implement fibonacci recursively,
 * which is just as fast as the iterative approach.
 */
public class H_FibonacciRecursive {

	public static void main(String[] args) {
		for (int i = 0; i <= 40; i++) {
			long startTime = System.currentTimeMillis();
			long fibOfi = fib(i);
			long endTime = System.currentTimeMillis();
			System.out.println("Iteration: fib(" + i + ") = " + fibOfi + " (" +
					(endTime - startTime) / 1000.0 + " sec)");

			startTime = System.currentTimeMillis();
			fibOfi = fibR(i);
			endTime = System.currentTimeMillis();
			System.out.println("Recursion: fib(" + i + ") = " + fibOfi + " (" +
					(endTime - startTime) / 1000.0 + " sec)");

			// Good version of recursion below:
			startTime = System.currentTimeMillis();
			fibOfi = fibRecGood(i);
			endTime = System.currentTimeMillis();
			System.out.println("Rec (good): fib(" + i + ") = " + fibOfi + " (" +
					(endTime - startTime) / 1000.0 + " sec)");

			System.out.println("--------------");
		}
	}

	// Iterative approach
	public static long fib(int n) {
		long previous = 1;
		long current = 1;
		for (int i = 1; i < n; i++) {
			long next = previous + current;
			previous = current;
			current = next;
		}
		return current;
	}

	// Bad recursive approach
	public static long fibR(int n) {
		if (n <= 1)
			return 1;
		else
			return fibR(n - 2) + fibR(n - 1);
	}

	//
	// Below: a different approach to implement recursion that is just as good as
	// the iterative approach.
	//
	public static long fibRecGood(int n) {
		return fibRecGood(n, 1, 1);
	}

	// prev1 represents the result obtained right before the current one
	// prev2 represents the result obtained right before prev1
	private static long fibRecGood(int n, long prev1, long prev2) {
		if (n <= 1)
			return prev1;

		return fibRecGood(n - 1, prev1 + prev2, prev1);
	}

}
