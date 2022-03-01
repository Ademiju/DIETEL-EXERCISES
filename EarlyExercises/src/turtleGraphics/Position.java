package turtleGraphics;

public class Position {
    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }
    @Override
    public boolean equals(Object toCompare){
        if(!toCompare.getClass().equals(this.getClass())) return false;
        Position toBeCompared = (Position) toCompare;
        if(this.row == toBeCompared.row && this.column == toBeCompared.column){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Position{");
        sb.append("row ").append(row);
        sb.append(" column ").append(column);
        sb.append("}");
        return sb.toString();
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
