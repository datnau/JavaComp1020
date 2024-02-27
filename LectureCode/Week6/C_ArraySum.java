/*Sum the elements os an array */

public class C_ArraySum {

	public static void main(String[] args) {
		int[] array1 = new int[] { 1, 9, 8, 5, 4 };
		int[] array2 = new int[] { 5, 4 };
		int[] array3 = new int[] { 4 };
		int[] array4 = new int[] {};
		System.out.println("Sum of [1,9,8,5,4] is:" + sumOf(array1));
		System.out.println("Sum of [5,4] is:" + sumOf(array2));
		System.out.println("Sum of [4] is:" + sumOf(array3));
		System.out.println("Sum of [] is:" + sumOf(array4));

	}

	// private recursive method that has the extra parameter n
	// n is how many elements we want to sum
	private static int sumOf(int[] data, int n) {
		// Returns the sum of the first n elements of data
		// (0 if n=0)

		if (n == 0) // -<- usually the easy case goes first in the method
			return 0;
		else
			System.out.println(n);
		// data[n-1] + the sum of the first (rest of) n-1 elements
		return data[n - 1] + sumOf(data, n - 1);

	}

	// public "interface" method (for the users)
	public static int sumOf(int[] data) {
		// Returns the sum of all elements of an array
		// (0 if there are no elements)
		return sumOf(data, data.length);

	}

}
