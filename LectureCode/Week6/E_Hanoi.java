/**
 * Illustrate the recursive solution to the "Towers of Hanoi"
 */
public class E_Hanoi {

	public static void main(String[] args) {
		solveHanoi(2, "Peg 1-left", "Peg 2-centre", "Peg 3-right");
		System.out.println("End of the program.");
	}

	public static void solveHanoi(int n, String A, String B, String C) {
		// Print instructions to move n disks from A to B,
		// with C available for temporary use. This method has 3 Towers of Hanoi
		if (n == 1)
			System.out.println("move disc 1 from " + A + " to " + B);
		else {
			solveHanoi(n - 1, A, C, B);
			System.out.println("move disc " + n + " from " + A + " to " + B);
			solveHanoi(n - 1, C, B, A);
		}

	}
}
