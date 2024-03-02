package Sorting;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int keyFound = 10;
        int index = binarySearch(array, 0, array.length - 1, keyFound);
        if (index != -1) {
            System.out.println("Your key " + keyFound + " is at index " + index);
        } else {
            System.out.println("Key is not found!!!");
        }

    }

    public static int binarySearch(int[] data, int lo, int hi, int key) {
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (data[mid] == key) {
                return mid;
            } else if (data[mid] < key) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }
}
