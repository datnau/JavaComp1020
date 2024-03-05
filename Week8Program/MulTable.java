public class MulTable {

    public static void main(String[] args) {
        int limit = 5;
        int[][] multiplicationTables = generateMultiplicationTables(limit);
        displayMultiplicationTables(multiplicationTables);
    }

    // Method to generate a multiplication table for a given number up to a
    // specified limit
    public static int[][] generateMultiplicationTables(int limit) {
        int[][] tables = new int[limit][];
        for (int i = 0; i < limit; i++) {
            tables[i] = new int[limit];
            for (int j = 0; j < limit; j++) {
                tables[i][j] = (i + 1) * (j + 1);
            }
        }
        return tables;
    }

    // Method to display the multiplication tables stored in the ragged array
    public static void displayMultiplicationTables(int[][] tables) {
        for (int i = 0; i < tables.length; i++) {
            System.out.println("Multiplication table for " + (i + 1) + ":");
            for (int j = 0; j < tables[i].length; j++) {
                System.out.println((j + 1) + " x " + (i + 1) + " = " + tables[i][j]);
            }
            System.out.println();
        }
    }
}
