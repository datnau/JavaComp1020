package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = { 2, 3, 1, 9, 5, 7, 6, 8, 4 };
        int[] sortedArr = insertionSort(array);
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.println(sortedArr[i]);
        }
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}
