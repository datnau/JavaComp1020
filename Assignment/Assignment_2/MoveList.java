import java.util.ArrayList;
import java.util.Random;

public class MoveList {
    private ArrayList<Move> moves;

    public MoveList() {
        moves = new ArrayList<>();
    }

    public void addMove(Move m) {
        moves.add(m);
    }

    public boolean isEmpty() {
        return moves.isEmpty();
    }

    public Move randomMove() {
        if (moves.isEmpty()) {
            return null;
        } else {
            Random random = new Random();
            int index = random.nextInt(moves.size());
            return moves.get(index);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Move move : moves) {
            sb.append(move.toString()).append("\n");
        }
        return sb.toString();
    }
}
