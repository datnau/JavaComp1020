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
        String str = "{";
        for (int i = 0; i < length(); i++) {
            if (i + 1 == length())
                str += directions.get(i);
            else
                str += directions.get(i) + ", ";
        }
        str += "}";
        return str;
    }

    public boolean isEmpty() {
        return directions.isEmpty();
    }

    public static DirectionList allDirections() {
        DirectionList allDirections = new DirectionList();
        allDirections.addDirection(new Direction(-1, 0)); // up
        allDirections.addDirection(new Direction(-1, 1)); // up-right
        allDirections.addDirection(new Direction(0, 1)); // right
        allDirections.addDirection(new Direction(1, 1)); // down-right
        allDirections.addDirection(new Direction(1, 0)); // down
        allDirections.addDirection(new Direction(1, -1)); // down-left
        allDirections.addDirection(new Direction(0, -1)); // left
        allDirections.addDirection(new Direction(-1, -1)); // up-left
        return allDirections;
    }
}
