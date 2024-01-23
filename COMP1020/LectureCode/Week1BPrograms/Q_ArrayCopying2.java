import java.util.Arrays;

public class Q_ArrayCopying2 {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 30, 31, 32 };
        int[] arr3 = new int[] { 30, 31, 32 };

        System.out.println("Array 1 is:" + Arrays.toString(arr1));
        System.out.println("Array 2 is:" + Arrays.toString(arr3));

        arr3[0] = 40;

        System.out.println("Array 1 is:" + Arrays.toString(arr1));
        System.out.println("Array 2 is:" + Arrays.toString(arr3));

    }

}
