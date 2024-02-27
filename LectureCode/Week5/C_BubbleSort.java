public class C_BubbleSort {
    public static void main(String[] args) {
        int[] data = { 78, 50, 26, 13, 10, 34, 57, 82 };
        int n = data.length;
        bubbleSort(data, n);
    }

    public static void bubbleSort(int data[], int n) {

        for (int pass = 0; pass < n; pass++) {
            for (int j = 0; j < n - 1 - pass; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
            for (int i : data) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
        for (int i : data) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
