public class MaxElement {
    public static int findMax(int arr[], int n) {
        if (n == 1)
            return arr[0];
        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }

    public static void main(String[] args) {
        int arr[] = { 14, 25, 8, 72, 36 };
        int n = arr.length;
        System.out.println("Max = " + findMax(arr, n));
    }
}
