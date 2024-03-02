public class MultiDimensionArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0] = new int[] { 7, 2, 1 };
        arr[1] = new int[] { 4, 1, 0 };
        arr[2] = new int[] { 5, 3, 6 };
        System.out.println(arr);
        System.out.println(arr[1]);
        System.out.println(arr[2][2]);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.err.println();
        }
    }
}