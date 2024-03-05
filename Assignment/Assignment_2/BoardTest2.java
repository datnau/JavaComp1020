import java.io.IOException;

public class BoardTest2 {
    public static void main(String[] args) {

        testImportBoardSetup1();
    }

    private static void testImportBoardSetup1() {
        try {
            System.out.println("\nImport Board Setup Special Exception Test 1: \n");

            // Create a new board object and import the board setup from the file
            // Exception: number of rows/columns less than 2
            Board board = new Board("fileToImport1.txt");
            System.out.println("Imported Board:");
            System.out.println(board);
        } catch (IOException e) {
            System.out.println("Failed to import board setup: " + e.getMessage() + "\n");
        }
    }

}
