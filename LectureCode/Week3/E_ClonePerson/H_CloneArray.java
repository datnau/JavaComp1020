public class H_CloneArray {
    public static void main(String[] args) {
        // clone arrays
        // /*arraycopy(Object source_arr, int sourcePos, Object dest_arr, int destPos,
        // int len)
        // Parameters :
        // source_arr : array to be copied from
        // sourcePos : starting position in source array from where to copy
        // dest_arr : array to be copied in
        // destPos : starting position in destination array, where to copy in
        // len : total no. of components to be copied.
        // */
        int[] a1 = { 4, 1, 7 };
        //int[] a2;
        //a2 = new int[a1.length];
        int[] a2 = new int[5];

        System.arraycopy(a1, 0, a2, 1, a1.length);
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
