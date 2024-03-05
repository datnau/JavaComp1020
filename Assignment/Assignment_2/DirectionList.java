import java.util.ArrayList;

public class DirectionList {
    private ArrayList<Direction> directions;

    public DirectionList() {
        directions = new ArrayList<>();
    }

    public void addDirection(Direction d) {
        directions.add(d);
    }

    public int length() {
        return directions.size();
    }

    public Direction getDirection(int i) {
        return directions.get(i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < directions.size(); i++) {
            sb.append(directions.get(i));
            if (i < directions.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public static DirectionList allDirections() {
        DirectionList allDirs = new DirectionList();
        allDirs.addDirection(new Direction(-1, 0)); // up
        allDirs.addDirection(new Direction(-1, 1)); // up-right
        allDirs.addDirection(new Direction(0, 1)); // right
        allDirs.addDirection(new Direction(1, 1)); // down-right
        allDirs.addDirection(new Direction(1, 0)); // down
        allDirs.addDirection(new Direction(1, -1)); // down-left
        allDirs.addDirection(new Direction(0, -1)); // left
        allDirs.addDirection(new Direction(-1, -1)); // up-left
        return allDirs;
    }
}
