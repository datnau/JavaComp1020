import java.io.IOException;

public class BoardTest4 {
    public static void main(String[] args) {

        testImportBoardSetup3();
    }

    private static void testImportBoardSetup3() {
        try {
            System.out.println("\nImport Board Setup Special Exception Test 3:\n");

            // Create a new board object and import the board setup from the file
            // Exception: The number of columns and rows doesn't match
            Board board = new Board("fileToImport3.txt");
            System.out.println("Imported Board:");
            System.out.println(board);
        } catch (IOException e) {
            System.out.println("Failed to import board setup: " + e.getMessage() + "\n");
        }
    }
}
