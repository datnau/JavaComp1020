public class E_SelectionSort {
    public static void main(String args[]) {

        int[] data = { 78, 50, 26, 13, 10, 34, 57, 82 };
        int n = data.length;
        System.out.println("Array before sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
        selectionSort(data);

    }

    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int k = 0; k <= n - 2; k++) {
            int min = a[k];
            int where = k;
            for (int i = k + 1; i < n; i++) {
                if (a[i] < min) {
                    min = a[i];
                    where = i;
                }
            }
            a[where] = a[k];
            a[k] = min;
            for (int i = 0; i < k; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        System.out.println("\nArray after sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }

}
