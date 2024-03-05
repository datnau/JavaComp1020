
public class BoardTest {
    public static void main(String[] args) {

        System.out.println("Initial board: ");
        Board board = new Board(5);
        System.out.println(board);

        // Make moves to create a scenario for the game
        // Black pieces
        System.out.println("Board after few moves: ");
        board.makeMove(Board.BLACK, new Move(0, 2, new DirectionList()));
        board.makeMove(Board.BLACK, new Move(0, 3, new DirectionList()));
        board.makeMove(Board.BLACK, new Move(0, 4, new DirectionList()));
        board.makeMove(Board.BLACK, new Move(1, 3, new DirectionList()));
        board.makeMove(Board.BLACK, new Move(1, 4, new DirectionList()));
        board.makeMove(Board.BLACK, new Move(2, 3, new DirectionList()));
        board.makeMove(Board.BLACK, new Move(2, 4, new DirectionList()));
        board.makeMove(Board.BLACK, new Move(4, 3, new DirectionList()));
        // White pieces
        board.makeMove(Board.WHITE, new Move(1, 1, new DirectionList()));
        board.makeMove(Board.WHITE, new Move(2, 1, new DirectionList()));
        board.makeMove(Board.WHITE, new Move(2, 2, new DirectionList()));
        board.makeMove(Board.WHITE, new Move(3, 1, new DirectionList()));
        board.makeMove(Board.WHITE, new Move(3, 2, new DirectionList()));
        board.makeMove(Board.WHITE, new Move(3, 3, new DirectionList()));
        board.makeMove(Board.WHITE, new Move(3, 4, new DirectionList()));
        System.out.println(board);
        System.out.println("Score is: " + board.getScore() + "\n");
        System.out.println("Opponet of 0 is: " + Board.opponentOf(0));
        System.out.println("Opponet of BLACK pieces is: " + Board.nameOf(0));
        System.out.println("Opponet of 1 is: " + Board.opponentOf(1));

        System.out.println("Opponet of WHITE pieces is: " + Board.nameOf(1));

    }
}
