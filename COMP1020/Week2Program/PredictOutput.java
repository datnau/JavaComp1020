public class PredictOutput {
    public static void main(String[] args) {
        int arr[] = { 10, 11, 12, 13, 14 };
        add(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void add(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] += i;
    }
}
