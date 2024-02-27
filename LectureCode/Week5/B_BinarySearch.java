public class B_BinarySearch {
    public static void main(String[] args) {

        int[] data = { 1, 3, 4, 5, 8, 9, 10, 12, 15 };
        int key = 19;
        int index = binarySearch(data, key);
        System.out.println("The key found at the index:" + index);

    }

    public static int binarySearch(int data[], int key) {

        int low = 0;
        int high = data.length - 1;
        int mid;
        int count = 0;
        while (low <= high) {
            count++;
            System.out.println("Count: " + count);

            mid = (low + high) / 2;
            System.out.println("Mid value: " + mid);
            if (data[mid] == key)
                return mid;
            else if (data[mid] < key)
                low = mid + 1;
            else if (data[mid] > key)
                high = mid - 1;
        }
        return -1;

    }

}
