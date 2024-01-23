import java.util.Arrays;

public class P_ArrayCopying {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 30, 31, 32 };
        int[] arr2;
        arr2 = arr1;

        System.out.println("Array 1 is:" + Arrays.toString(arr1));
        System.out.println("Array 2 is:" + Arrays.toString(arr2));

        arr2[0] = 40;

        System.out.println("Array 1 is:" + Arrays.toString(arr1));
        System.out.println("Array 2 is:" + Arrays.toString(arr2));

    }

}
