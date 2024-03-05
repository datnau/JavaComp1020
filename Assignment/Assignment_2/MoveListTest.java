public class MoveListTest {
    public static void main(String[] args) {
        testToString();
    }

    private static void testToString() {
        System.out.println("ToString test:");
        MoveList moveList = new MoveList();

        DirectionList directions1 = new DirectionList();
        directions1.addDirection(new Direction(1, 0));

        Move move1 = new Move(1, 2, directions1);
        moveList.addMove(move1);

        DirectionList directions2 = new DirectionList();
        directions2.addDirection(new Direction(0, 1));
        directions2.addDirection(new Direction(1, 1));

        Move move2 = new Move(2, 0, directions2);
        moveList.addMove(move2);

        DirectionList directions3 = new DirectionList();
        directions3.addDirection(new Direction(0, -1));
        directions3.addDirection(new Direction(1, -1));

        Move move3 = new Move(2, 5, directions3);
        moveList.addMove(move3);

        DirectionList directions4 = new DirectionList();
        directions4.addDirection(new Direction(0, 1));

        Move move4 = new Move(4, 0, directions4);
        moveList.addMove(move4);

        System.out.println(moveList);
    }
}
