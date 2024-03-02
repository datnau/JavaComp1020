package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = { 11, 3, 22, 12, 46, 57, 25, 89, 67, 51 };
        int[] sortedArr = bubbleSort(array);
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.println(sortedArr[i]);
        }
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
