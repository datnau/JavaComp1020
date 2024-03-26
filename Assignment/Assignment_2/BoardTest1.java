import java.io.IOException;

public class BoardTest1 {
    public static void main(String[] args) {

        testSaveFile();
        testImportBoardSetup();

    }

    private static void testSaveFile() {
        try {
            String filename = "saved_board.txt";

            Board board = new Board(4);
            board.makeMove(Board.BLACK, new Move(0, 2, new DirectionList()));
            board.makeMove(Board.BLACK, new Move(1, 1, new DirectionList()));
            board.makeMove(Board.BLACK, new Move(1, 2, new DirectionList()));
            board.makeMove(Board.WHITE, new Move(2, 0, new DirectionList()));
            board.makeMove(Board.WHITE, new Move(2, 1, new DirectionList()));
            board.makeMove(Board.WHITE, new Move(2, 2, new DirectionList()));
            board.makeMove(Board.WHITE, new Move(2, 3, new DirectionList()));
            board.makeMove(Board.BLACK, new Move(3, 1, new DirectionList()));
            board.makeMove(Board.WHITE, new Move(3, 3, new DirectionList()));
            System.out.println("Save File Test:");
            board.saveFile(filename);
            System.out.println("Board saved successfully and the file is " + filename);
        } catch (IOException e) {
            System.out.println("Failed to save board: " + e.getMessage());
        }
    }

    private static void testImportBoardSetup() {
        try {
            System.out.println("\nImport Board Setup Test:");
            Board board = new Board("fileToImport3.txt");
            System.out.println(board);
        } catch (Exception e) {
            System.out.println("Failed to import board setup: " + e.getMessage());
        }
    }

}
