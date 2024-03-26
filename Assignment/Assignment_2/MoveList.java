import java.util.ArrayList;
import java.util.Random;

public class MoveList {
    private ArrayList<Move> moves;

    public MoveList() {
        this.moves = new ArrayList<>();
    }

    public void addMove(Move move) {
        moves.add(move);
    }

    public boolean isEmpty() {
        return moves.isEmpty();
    }

    public Move randomMove() {
        if (!moves.isEmpty()) {
            Random random = new Random();
            return moves.get(random.nextInt(moves.size()));
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < moves.size(); i++) {
            result += moves.get(i).toString() + "\n";
        }
        return result;
    }
}
