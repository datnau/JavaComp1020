package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = { 99, 88, 55, 77, 1, 66 };
        selectionSort(array); // Call the method to sort the array
        System.out.println("Sorted Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minValueIndex]) {
                    minValueIndex = j;
                }
            }
            if (minValueIndex != i) {
                // Swap arr[i] and arr[minValueIndex]
                int temp = arr[minValueIndex];
                arr[minValueIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
