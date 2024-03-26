import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Board {
    private int[][] board; // Change to int array
    private int boardSize;
    public static final int EMPTY = 0;
    public static final int BLACK = 1;
    public static final int WHITE = 2;

    public Board(int size) {
        boardSize = size;
        board = new int[boardSize][boardSize]; // Change to int array
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

    public Board(String fileName) throws IOException {
        importBoardSetup(fileName);
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                char symbol = '.';
                if (board[i][j] == BLACK) {
                    symbol = 'X';
                } else if (board[i][j] == WHITE) {
                    symbol = 'O';
                }
                result += symbol + " ";
            }
            result += '\n';
        }
        return result;
    }

    public static int opponentOf(int player) {
        if (player == BLACK) {
            return WHITE;
        } else {
            return BLACK;
        }
    }

    public static String nameOf(int player) {
        if (player == BLACK) {
            return "Black";
        } else {
            return "White";
        }
    }

    public int getScore() {
        int blackCount = 0;
        int whiteCount = 0;

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                int cell = board[i][j];
                if (cell == BLACK) {
                    blackCount++;
                } else if (cell == WHITE) {
                    whiteCount++;
                }
            }
        }

        return blackCount - whiteCount;
    }

    public MoveList allValidMoves(int player) {
        MoveList moves = new MoveList();

        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                if (board[row][col] == EMPTY) {
                    DirectionList directions = getAllDirections(row, col, player);
                    if (!directions.isEmpty()) {
                        moves.addMove(new Move(row, col, directions));
                    }
                }
            }
        }

        return moves;
    }

    private DirectionList getAllDirections(int row, int col, int player) {
        DirectionList directions = DirectionList.allDirections();
        DirectionList validDirections = new DirectionList();

        for (int i = 0; i < directions.length(); i++) {
            Direction direction = directions.getDirection(i);
            if (isValidDirection(row, col, direction, player)) {
                validDirections.addDirection(direction);
            }
        }

        return validDirections;
    }

    private boolean isValidDirection(int row, int col, Direction direction, int player) {
        int opponent = opponentOf(player);
        int newRow = row + direction.getRowChange();
        int newCol = col + direction.getColumnChange();
        if (!isValidPosition(newRow, newCol) || board[newRow][newCol] != opponent) {
            return false;
        }
        while (isValidPosition(newRow, newCol)) {
            if (board[newRow][newCol] == EMPTY) {
                return false;
            } else if (board[newRow][newCol] == player) {
                return true;
            }
            newRow += direction.getRowChange();
            newCol += direction.getColumnChange();
        }

        return false;
    }

    private boolean isValidPosition(int row, int col) {
        return row >= 0 && row < boardSize && col >= 0 && col < boardSize;
    }

    public void makeMove(int player, Move theMove) {
        int row = theMove.getRowNumber();
        int col = theMove.getColNumber();
        DirectionList directions = theMove.getDirectionList();

        board[row][col] = player;
        for (int i = 0; i < directions.length(); i++) {
            Direction direction = directions.getDirection(i);
            int newRow = row + direction.getRowChange();
            int newCol = col + direction.getColumnChange();
            while (isValidPosition(newRow, newCol) && board[newRow][newCol] == opponentOf(player)) {
                board[newRow][newCol] = player;
                newRow += direction.getRowChange();
                newCol += direction.getColumnChange();
            }
        }
    }

    public void importBoardSetup(String fileName) throws IOException {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            int size = scanner.nextInt();
            if (size < 2) {
                throw new IOException("Number of rows/columns less than 2");
            }
            boardSize = size;
            board = new int[boardSize][boardSize];
            scanner.nextLine(); // move to the next line
            for (int i = 0; i < boardSize; i++) {
                String line = scanner.nextLine();
                String[] tokens = line.split(" ");
                if (tokens.length != boardSize) {
                    throw new IOException("The number of columns and rows doesn't match");
                }

                for (int j = 0; j < boardSize; j++) {
                    char symbol = tokens[j].charAt(0);
                    if (symbol == '.') {
                        board[i][j] = EMPTY;
                    } else if (symbol == 'X') {
                        board[i][j] = BLACK;
                    } else if (symbol == 'O') {
                        board[i][j] = WHITE;
                    } else {
                        throw new IOException("Unrecognized character: " + symbol);
                    }

                }

            }

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found: " + fileName);
        }

    }

    public void saveFile(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(boardSize + "\n");
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                char symbol;
                if (board[i][j] == EMPTY) {
                    symbol = '.';
                } else if (board[i][j] == BLACK) {
                    symbol = 'X';
                } else {
                    symbol = 'O';
                }
                writer.write(symbol + " ");
            }
            writer.write("\n");
        }
        writer.close();
    }
}
