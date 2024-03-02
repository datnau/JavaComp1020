public class Q2_2DMatrix {
    private char[][] matrix;
    private int rows;
    private int cols;

    public Q2_2DMatrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new char[rows][cols];
        fillAboveDiagonal();
    }

    public void fillAboveDiagonal() {
        char currentChar = 'A';
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols - row; col++) {
                matrix[row][col] = currentChar;

            }
            currentChar++;
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
        Q2_2DMatrix matrix_1 = new Q2_2DMatrix(5, 5);
        System.out.println(matrix_1);
    }
}
