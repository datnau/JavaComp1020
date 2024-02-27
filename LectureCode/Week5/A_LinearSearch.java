
public class A_LinearSearch {
    public static void main(String[] args) {
        int[] data = { 1, 3, 4, 5, 8, 9, 10, 12, 13, 15 };
        int key = 15;
        int index = linearSearch(data, key);
        System.out.println("The key found at the index:" + index);
    }

    public static int linearSearch(int data[], int key) {
        int low = 0;
        int n = data.length;
        int high = n - 1;
        int index = low;
        int count = 0;
        for (index = low; index <= high; index++) {
            count++;
            System.out.println("count is: " + count);

            if (key == data[index])
                return index;
        }

        return -1;

    }
}
