public class Lab1 {
    public static void main(String[] args) {
        final int START = 0;
        final int END = 10752;
        final int INCREMENT = 256;
        final int COLUMNS = 8;
        final boolean RIGHT_JUSTIFY = true;
        for (int i = START; i <= END; i += INCREMENT) {

            if ((i - START) % (COLUMNS * INCREMENT) == 0 && (i - START) != 0) {
                System.out.println();
            }

            if (RIGHT_JUSTIFY) {
                System.out.printf("%6d", i);
            } else {
                System.out.printf("%-6d", i);
            }
        }

        // Display the footer
        System.out.println("\n*** End of program. ***");

    }
}
