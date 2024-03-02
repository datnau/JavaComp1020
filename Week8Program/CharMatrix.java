public class CharMatrix {
    private final char C = '.';
    private char[][] matrix;
    private int rows;
    private int cols;

    public CharMatrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new char[rows][cols];
        fillMatrix(C);
    }

    public CharMatrix(int rows, int cols, char c) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new char[rows][cols];
        fillMatrix(c);
    }

    private void fillMatrix(char c) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = c;
            }
        }
    }

    public void fillTopHalf(char c) {
        fillMatrix(C);
        for (int row = 0; row < (rows / 2); row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = c;
            }
        }
    }

    public void fillBottomHalf(char c) {
        fillMatrix(C);
        for (int row = rows / 2; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = c;
            }
        }
    }

    public void fillDiagonal(char c) {
        fillMatrix(C);
        /*
         * int limit = Math.min(rows, cols);
         * for(int i = 0; i < limit; i++) {
         * matrix[i][i] = c;
         */
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (row == col)
                    matrix[row][col] = c;

            }
        }
    }

    public void fillAboveDiagonal(char c) {
        fillMatrix(C);
        for (int row = 0; row < rows; row++) {
            for (int col = row; col < cols; col++) {
                matrix[row][col] = c;
                /*
                 * if (col >= row)
                 * matrix[row][col] = c;
                 */
            }
        }
    }

    public void fillBellowDiagonal(char c) {
        fillMatrix(C);
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col <= row; col++) {
                // if (col <= row)
                matrix[row][col] = c;
            }
        }
    }

    public void fillEveryOtherRow(char c) {
        fillMatrix(C);
        for (int row = 0; row < rows; row += 2) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = c;
            }
        }
    }

    public void fillEveryOtherCol(char c) {
        fillMatrix(C);
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col += 2) {
                matrix[row][col] = c;
            }
        }
    }

    public void fillChessBoard(char c) {
        fillMatrix(C);
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (row % 2 == 0 && col % 2 == 0) {
                    matrix[row][col] = c;
                } else if (row % 2 != 0 && col % 2 != 0) {
                    matrix[row][col] = c;
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

    /*
     * public String toStringRotated() {
     * String toReturn = "";
     * for (int col = 0; col < cols; col++) {
     * for (int row = 0; row < rows; row++) {
     * toReturn += matrix[row][col] + " ";
     * }
     * toReturn += "\n";
     * }
     * return toReturn;
     * }
     */

    public void printMatrix() {
        System.out.println(toString());
    }

    // public void printMatrixRotated() {
    // System.out.println(toStringRotated());
    // }
}