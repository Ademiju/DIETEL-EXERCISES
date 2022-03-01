package tutleGraphics;

public class Point {
    private int row;
    private int column;
    public Point(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return "Point{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }

    @Override
    public boolean equals(Object objectToCompare){
        if(!objectToCompare.getClass().equals(this.getClass())) return false;

        Point pointToBeCompared = (Point) objectToCompare;
        if(this.row == pointToBeCompared.row && this.column == pointToBeCompared.column ) {
            return true;
        }
        return false;
        }

    public int getRow() {
        return row;
    }

    public int getColumn(){
        return column;
    }
    public void setColumn(int steps) {
        column = steps;
    }
    public void setRow(int steps) {
        row = steps;
    }
}

