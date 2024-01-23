import java.util.Arrays;

public class ArraysEx {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++)
            System.err.println(arr);
        // method 1
        for (int i = 0; i < 5; i++)
            System.out.print(arr[i] + "\t");

        // method 2
        System.out.println("\n" + Arrays.toString(arr));

        // method 3
        for (int element : arr)
            System.out.println(element);
        // access
        System.out.println(arr[0]);// 1
        arr[3] = arr[0] + arr[3];
        System.out.println(arr[0]);// 5
    }
}
