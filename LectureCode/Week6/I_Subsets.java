import java.util.ArrayList;

public class I_Subsets {

	public static void main(String[] args) {
		final int LIST_SIZE = 3;

		// Create an ArrayList of LIST_SIZE things
		ArrayList testList = new ArrayList();
		for (int i = 1; i <= LIST_SIZE; i++)
			testList.add(i);

		// Find all subsets of every size from 0 to LIST_SIZE.
		for (int k = 0; k <= testList.size(); k++) {
			System.out.println("All subsets of size " + k + " are:");
			printSubsets(k, testList);
			System.out.println();
		} // for
	}// main

	public static void printSubsets(int k, ArrayList list) {
		/*
		 * Print, one per line, all possible subsets of size
		 * k from the elements of list.
		 */
		printSubsetsPrefix("", k, list);
	}// printSubsets

	private static void printSubsetsPrefix(String prefix, int k, ArrayList list) {
		// Print, one per line, all possible subsets of size k
		// of the elements of list, with the given prefix added to all of them.
		if (k > list.size())
			return; // Not possible. Not enough left.
		else if (k == 0)
			System.out.println(prefix); // Done. No more left to choose.
		else {
			// Make sure you don't destroy the original list!
			// It's an Object, so it will change the Object for the caller, too.
			ArrayList rest = ((ArrayList) (list.clone())); // clone() actually returns an Object reference!
			Object first = rest.remove(0);
			// 1. Print the ones where first is used
			printSubsetsPrefix(prefix + " " + first, k - 1, rest);
			// 2. Print the ones where first is not used
			printSubsetsPrefix(prefix, k, rest);
		}
	}// printSubsetsPrefix

}
