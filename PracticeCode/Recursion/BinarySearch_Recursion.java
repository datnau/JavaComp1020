package Recursion;

public class BinarySearch_Recursion {
    public static void main(String[] args) {
        int[] array_1 = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21 };
        int findKey = 13;
        int index = binSearch(array_1, findKey);
        if (index == -1) {
            System.out.println("Key not found!!!");
        } else {
            System.out.println("Your found key " + findKey + " is in index " + index);
        }

    }

    public static int binSearch(int[] array, int lo, int hi, int key) {
        if (hi < lo) {
            return -1;
        } else {
            int mid = (lo + hi) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                return binSearch(array, mid + 1, hi, key);

            } else {
                return binSearch(array, lo, mid - 1, key);
            }
        }
    }

    public static int binSearch(int[] array, int key) {
        return binSearch(array, 0, array.length - 1, key);
    }

}
