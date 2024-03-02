public class Q5_2DMatrix {
    private char ch;
    private char[][] matrix;
    private int rows;
    private int cols;

    public Q5_2DMatrix(int rows, int cols, char ch) {
        this.rows = rows;
        this.cols = cols;
        this.ch = ch;
        this.matrix = new char[rows][cols];
        fillUpMatrix();
    }

    private void fillUpMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = ch;
            }
        }
    }

    public void printPattern(int n) {
        if (n <= 0)
            return;
        for (int i = 0; i < n; i++) {
            System.out.print(ch + " ");
        }
        System.out.println();
        printPattern(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q5_2DMatrix matrix_1 = new Q5_2DMatrix(10, 5, '*');
        matrix_1.printPattern(5);
    }
}
