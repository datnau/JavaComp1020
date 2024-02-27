public class E_InsertionSort {
    public static void main(String[] args) {
        int[] data = { 17, 22, 12, 20 };
        int n = data.length;

        System.out.println("Before Sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        for (int k = 1; k < n; k++) {

            insertionSort(data, k, data[k]);
        }

        System.out.println("After Sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static void insertionSort(int[] data, int k, int newItem) {
        int index = k - 1;
        boolean spotFound = false;
        while (index >= 0 && !spotFound) {
            if (data[index] > newItem) {
                data[index + 1] = data[index];
                index--;
            } else {
                spotFound = true;
            }
        }
        data[index + 1] = newItem;
    }
}
