public class CharMatrixTest {
    public static void main(String[] args) {
        CharMatrix matrix = new CharMatrix(3, 3);
        matrix.printMatrix();
        // matrix.printMatrixRotated();
        // matrix.fillTopHalf('x');
        // matrix.printMatrix();

        // matrix.fillBottomHalf('x');
        // matrix.printMatrix();
        // matrix.fillDiagonal('x');
        // matrix.printMatrix();
        // matrix.fillAboveDiagonal('x');
        // matrix.printMatrix();
        // matrix.fillBellowDiagonal('x');
        // matrix.printMatrix();
        matrix.fillEveryOtherRow('x');
        matrix.printMatrix();
        // matrix.fillEveryOtherCol('x');
        // matrix.printMatrix();
        // matrix.fillChessBoard('x');
        // matrix.printMatrix();

    }
}
