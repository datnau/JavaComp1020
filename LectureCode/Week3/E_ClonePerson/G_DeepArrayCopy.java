public class G_DeepArrayCopy {
    public static void main(String[] args) {
        // deep copy arrays
        int[] a1 = { 4, 1, 7 };
        int[] a2;
        a2 = new int[a1.length];
        for (int i = 0; i < a1.length; i++)
            a2[i] = a1[i];
        System.out.println("Array 1 elements:");
        for (int i = 1; i <= a1.length; i++) {

            System.out.print(a1[i - 1] + " ");
        }
        System.out.println();
        System.out.println("Array 2 elements:");
        for (int i = 1; i <= a2.length; i++) {
            System.out.print(a2[i - 1] + " ");
        }
    }

}
