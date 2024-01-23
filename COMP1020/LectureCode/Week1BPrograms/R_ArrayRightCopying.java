import java.util.Arrays;

public class R_ArrayRightCopying {
    public static void main(String args[]) {

        int[] arr1 = new int[] { 30, 31, 32 };
        int[] arr2 = new int[arr1.length];
        // arr2 = arr1;
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Array 1 is:" + Arrays.toString(arr1));
        System.out.println("Array 2 is:" + Arrays.toString(arr2));
        arr2[0] = 40;
        System.out.println("Array 1 is:" + Arrays.toString(arr1));
        System.out.println("Array 2 is:" + Arrays.toString(arr2));

    }
}
