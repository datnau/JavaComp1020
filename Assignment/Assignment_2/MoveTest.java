public class MoveTest {
    public static void main(String[] args) {
        testMove();
    }

    private static void testMove() {
        DirectionList directions = new DirectionList();
        directions.addDirection(new Direction(0, -1));
        directions.addDirection(new Direction(1, -1));

        Move move = new Move(2, 5, directions);
        System.out.println("Move class test:");
        System.out.println("Row: " + move.getRowNumber());
        System.out.println("Column: " + move.getColNumber());
        System.out.println("Directions: " + move.getDirectionList());
        System.out.println("toString(): " + move);
    }
}
