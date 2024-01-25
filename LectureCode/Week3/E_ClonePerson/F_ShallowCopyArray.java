public class F_ShallowCopyArray {
    public static void main(String[] args) {
        // shallow copy arrays

        int[] a1 = { 4, 1, 7 };
        int[] a2;
        a2 = a1;
        System.out.println("Array 1 elements:");
        for (int i = 1; i <= a1.length; i++) {

            System.out.print(a1[i - 1] + " ");
        }
        System.out.println();
        System.out.println("Array 2 elements:");
        for (int i = 1; i <= a2.length; i++) {
            System.out.print(a2[i - 1] + " ");
        }
        a2[0] = 5;
        System.out.println("\n After changes:");
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
