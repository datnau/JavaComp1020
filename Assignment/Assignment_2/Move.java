public class Move {
    private int row;
    private int column;
    private DirectionList directions;

    public Move(int row, int column, DirectionList directions) {
        this.row = row;
        this.column = column;
        this.directions = directions;
    }

    public int getRowNumber() {
        return row;
    }

    public void setRowNumber(int row) {
        this.row = row;
    }

    public int getColNumber() {
        return column;
    }

    public void setColNumber(int column) {
        this.column = column;
    }

    public DirectionList getDirectionList() {
        return directions;
    }

    public String toString() {
        return "(" + row + "," + column + ")" + " flips directions " + directions.toString();
    }
}
