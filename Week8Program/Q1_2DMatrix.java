public class Q1_2DMatrix {
    private char ch;
    private char[][] matrix;
    private int rows;
    private int cols;

    public Q1_2DMatrix(int rows, int cols, char ch) {
        this.rows = rows;
        this.cols = cols;
        this.ch = ch;
        this.matrix = new char[rows][cols];
        fillUpMatrix();
    }

    private void fillUpMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || j == 0 || i == rows - 1 || j == cols - 1) {
                    matrix[i][j] = ch;
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }
    }

    public String toString() {
        String toReturn = "";
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                toReturn += matrix[row][col] + " ";
            }
            toReturn += "\n";
        }
        return toReturn;
    }

    public static void main(String[] args) {
        Q1_2DMatrix matrix_1 = new Q1_2DMatrix(6, 6, '*');
        System.out.println(matrix_1);
    }
}
