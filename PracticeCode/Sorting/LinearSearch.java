package Sorting;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 22, 33, 12, 13, 43, 5, 3, 26, 7, 4, 1, 33 };
        int result = linearSearch(arr, 43);
        System.out.println(result);
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1; // Move the return -1 outside of the loop
    }
}
