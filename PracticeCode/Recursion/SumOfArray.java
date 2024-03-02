package Recursion;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = sumOf(arr, arr.length - 1);
        System.out.println("Sum: " + sum);

        int[] arr2 = new int[] { 5, 6, 7, 8, 9 };
        int sum2 = sumOf(arr2);
        System.out.println("Sum2: " + sum2);
    }

    public static int sumOf(int[] data) {
        return sumOf(data, data.length - 1);
    }

    public static int sumOf(int[] data, int n) {
        if (n == 0) {
            return 0; // Base case: when there are no elements left
        } else {
            return data[n] + sumOf(data, n - 1); // Recursively summing elements
        }
    }
}
