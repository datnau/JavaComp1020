public class Q3_3DArray {
    public static void main(String[] args) {
        Q3_3DArray q = new Q3_3DArray();
        int[][] array = q.mulTable(2, 3);
        q.displayMul(array);
    }

    public int[][] mulTable(int n, int m) {
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }
        return arr;
    }

    public void displayMul(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
