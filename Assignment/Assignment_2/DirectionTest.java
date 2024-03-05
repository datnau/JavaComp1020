public class DirectionTest {
    public static void main(String[] args) {
        testDirections();
        testAllDirections();
    }

    private static void testDirections() {
        Direction direction = new Direction(-1, 0);
        System.out.println("Direction initialization test:");
        System.out.println("Row change: " + direction.getRowChange());
        System.out.println("Column change: " + direction.getColumnChange());
        System.out.println("Checking the toString(): " + direction);
    }

    private static void testAllDirections() {
        System.out.println("\nDifferent directions test:");
        Direction[] directions = {
                new Direction(-1, 1),
                new Direction(1, -1),
                new Direction(1, 0),
                new Direction(0, -1),

        };

        for (Direction direction : directions) {
            System.out.println(direction.toString());
        }
    }
}
