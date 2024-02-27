public class D1_OrderedInsertion {
    public static void main(String[] args) {
        int[] data = new int[10];
        int[] data1 = { 1, 2, 4, 7, 8, 9 };
        int n = data1.length;
        for (int i = 0; i < n; i++) {
            data[i] = data1[i];

        }
        System.out.println("Data array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
        int newKey = 5;
        orderInsert(n, data, newKey);

    }

    public static void orderInsert(int n, int data[], int newKey) {
        boolean spotFound = false;

        for (int index = n - 1; index >= 0 && !spotFound; index--)
            if (data[index] > newKey) {
                data[index + 1] = data[index];

            } else {
                spotFound = true;
                data[index + 1] = newKey;
            }

        System.out.println("\nThe array after insertion: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

}
