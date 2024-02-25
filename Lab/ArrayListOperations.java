import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        // Create two sample array lists with some common elements
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        int[] data1 = { 45, 12, 98, 34, 6, 42 };
        int[] data2 = { 6, 81, 36, 12, 77, 42 };
        for (int i = 0; i < data1.length; i++)
            a1.add(data1[i]);
        for (int i = 0; i < data2.length; i++)
            a2.add(data2[i]);
        System.out.println("a1 is " + a1);
        System.out.println("a2 is " + a2);

        // Use the extractDuplicates method and print the results.
        ArrayList<Integer> removed = extractDuplicates(a1, a2);
        System.out.println("removed elements: " + removed);
        System.out.println("a1 is now " + a1);
        System.out.println("a2 is now " + a2);
    }

    public static ArrayList<Integer> extractDuplicates(ArrayList<Integer> a1, ArrayList<Integer> a2) {
        ArrayList<Integer> removed = new ArrayList<>();
        // Iterate over a1
        for (int i = 0; i < a1.size(); i++) {
            // Get the current element from a1
            Integer elementA1 = a1.get(i);
            // Iterate over a2
            for (int j = 0; j < a2.size(); j++) {
                // Get the current element from a2
                Integer elementA2 = a2.get(j);
                // Check if the elements are equal
                if (elementA1.equals(elementA2)) {
                    // If found, remove the elements from both lists
                    a1.remove(elementA1);
                    a2.remove(elementA2);
                    // Add the element to the removed list
                    removed.add(elementA1);
                    // Adjust indices after removal
                    i--;
                    break; // Exit the inner loop once a match is found
                }
            }
        }
        return removed;
    }
}
