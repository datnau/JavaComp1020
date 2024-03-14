import java.util.ArrayList;
import java.util.List;

public class Board {
    private int[][] board;
    private int boardSize;

    public static final int EMPTY = 0;
    public static final int BLACK = 1;
    public static final int WHITE = 2;

    public Board(int size) {
        boardSize = size;
        board = new int[boardSize][boardSize];

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = EMPTY;
            }
        }

        int mid = boardSize / 2;
        if (boardSize % 2 == 0) {
            board[mid - 1][mid - 1] = WHITE;
            board[mid][mid] = WHITE;
            board[mid - 1][mid] = BLACK;
            board[mid][mid - 1] = BLACK;
        } else {
            board[mid - 1][mid - 1] = WHITE;
            board[mid][mid - 1] = WHITE;
            board[mid - 1][mid] = BLACK;
            board[mid - 2][mid - 1] = BLACK;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                switch (board[i][j]) {
                    case EMPTY:
                        sb.append('.');
                        break;
                    case BLACK:
                        sb.append('X');
                        break;
                    case WHITE:
                        sb.append('O');
                        break;
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public static int opponentOf(int player) {
        return (player == BLACK) ? WHITE : BLACK;
    }

    public static String nameOf(int player) {
        return (player == BLACK) ? "Black" : "White";
    }

    public int getScore() {
        int blackCount = 0;
        int whiteCount = 0;

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (board[i][j] == BLACK) {
                    blackCount++;
                } else if (board[i][j] == WHITE) {
                    whiteCount++;
                }
            }
        }

        return blackCount - whiteCount;
    }

    private boolean isOnBoard(int row, int col) {
        return row >= 0 && row < boardSize && col >= 0 && col < boardSize;
    }

    private List<int[]> checkDirection(int row, int col, int player, int rowDirection, int colDirection) {
        int opponent = opponentOf(player);
        List<int[]> flippedPieces = new ArrayList<>();

        row += rowDirection;
        col += colDirection;

        while (isOnBoard(row, col) && board[row][col] == opponent) {
            flippedPieces.add(new int[]{row, col});
            row += rowDirection;
            col += colDirection;
        }

        if (isOnBoard(row, col) && board[row][col] == player && !flippedPieces.isEmpty()) {
            return flippedPieces;
        } else {
            return null;
        }
    }

    private Move checkMoveValidity(int row, int col, int player) {
        int[][] directions = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1},           {0, 1},
                {1, -1},  {1, 0},  {1, 1}
        };
        Move move = new Move( row, col,  directions);
        boolean validMove = false;

        for (int[] direction : directions) {
            List<int[]> flippedPieces = checkDirection(row, col, player, direction[0], direction[1]);
            if (flippedPieces != null) {
                validMove = true;
                move.addFlippedPieces(flippedPieces);
            }
        }

        return validMove ? move : null;
    }

    public MoveList allValidMoves(int player) {
        MoveList validMoves = new MoveList();

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (board[i][j] == EMPTY) {
                    Move move = checkMoveValidity(i, j, player);
                    if (move != null) {
                        validMoves.add(move);
                    }
                }
            }
        }

        return validMoves;
    }

    public void makeMove(int player, Move theMove) {
        int row = theMove.getRow();
        int col = theMove.getCol();

        board[row][col] = player;

        for (List<int[]> flippedPieces : theMove.getFlippedPieces()) {
            for (int[] piece : flippedPieces) {
                board[piece[0]][piece[1]] = player;
            }
        }
    }
}