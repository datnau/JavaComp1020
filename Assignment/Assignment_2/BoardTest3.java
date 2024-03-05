import java.io.IOException;

public class BoardTest3 {
    public static void main(String[] args) {

        testImportBoardSetup2();
    }

    private static void testImportBoardSetup2() {
        try {
            System.out.println("\nImport Board Setup Special Exception Test 2: \n");

            // Create a new board object and import the board setup from the file
            // Exception: Unrecognized character: D
            Board board = new Board("fileToImport2.txt");
            System.out.println("Imported Board:");
            System.out.println(board);
        } catch (IOException e) {
            System.out.println("Failed to import board setup: " + e.getMessage() + "\n");
        }
    }
}
