public class Direction {
    private int row;
    private int column;

    public Direction(int row, int column) {
        this.row = row;
        this.column = column;

    }

    public int getRowChange() {
        return row;
    }

    public void setRowChange(int row) {
        this.row = row;
    }

    public int getColumnChange() {
        return column;
    }

    public void setColumnChange(int column) {
        this.column = column;
    }

    public String toString() {
        if (row == -1 && column == 0) {
            return "< up >";
        } else if (row == -1 && column == 1) {
            return "< up > < right >";
        } else if (row == 0 && column == 1) {
            return "< right >";
        } else if (row == 1 && column == 1) {
            return "< down > < right >";
        } else if (row == 1 && column == 0) {
            return "< down >";
        } else if (row == 1 && column == -1) {
            return "< down > < left >";
        } else if (row == 0 && column == -1) {
            return "< left >";
        } else {
            return "< up > < left >";
        }
    }
}
