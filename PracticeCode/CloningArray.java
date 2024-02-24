public class CloningArray {
    public static void main(String[] args) {
        int[] a1 = { 4, 1, 7 };
        int[] a2;

        // Create a new array with the same length as a1
        a2 = new int[a1.length];

        // Copy the elements from a1 to a2
        // for (int i = 0; i < a1.length; i++) {
        // a2[i] = a1[i];
        // }

        // We can use another way to cope the elements from a1 to a2
        System.arraycopy(a1, 0, a2, 0, a1.length);

        // Print the elements of a2
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + " ");
        }
        System.out.println(); // Print a newline after the array elements

    }
}
