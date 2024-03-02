public class Q4_2DMatrix {
    private char[][] matrix;
    private int rows;
    private int cols;

    public Q4_2DMatrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new char[rows][cols];
        fillBelowDiagonal();
    }

    public void fillBelowDiagonal() {
        char ch = '1';
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (col <= row) {
                    if (col % 2 == 0 && ch % 2 == 0) {
                        matrix[row][col] = ch;
                    } else {
                        matrix[row][col] = ch;
                    }
                } else {
                    matrix[row][col] = ' ';
                }
            }
            ch++;
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
        Q4_2DMatrix matrix_1 = new Q4_2DMatrix(5, 5);
        System.out.println(matrix_1);
    }
}
