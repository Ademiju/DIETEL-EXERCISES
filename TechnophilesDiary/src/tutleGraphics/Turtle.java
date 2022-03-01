package tutleGraphics;

public class Turtle {

    private Point currentPoint = new Point(0,0);

    public Point getCurrentPosition(){
        return currentPoint;
    }
    Pen pen = new Pen();
    private Direction currentDirection = Direction.EAST;

    public Pen getPen(){
        return pen;
    }

    public void penDown() {
        pen.setState(PenState.DOWN);

    }

    public void penUp() {
        pen.setState(PenState.UP);
    }

    public Direction direction() {
        return currentDirection;
    }

    public void turnRight() {
        if(currentDirection == Direction.EAST) turnTo(Direction.SOUTH);
        else if(currentDirection == Direction.SOUTH)turnTo(Direction.WEST);
        else if(currentDirection == Direction.WEST)turnTo(Direction.NORTH);
        else if(currentDirection == Direction.NORTH)turnTo(Direction.EAST);
    }

    private void turnTo(Direction direction) {
        currentDirection = direction;
    }

    public void turnLeft() {
        if (currentDirection == Direction.EAST)turnTo(Direction.NORTH);
        else if(currentDirection == Direction.NORTH)turnTo(Direction.WEST);
        else if(currentDirection == Direction.WEST)turnTo(Direction.SOUTH);
        else if(currentDirection == Direction.SOUTH)turnTo(Direction.EAST);
    }

    public void move(int steps) {
        if (currentDirection == Direction.EAST)increaseColumnBy(steps-1);
        if (currentDirection == Direction.SOUTH)increaseRowBy(steps-1);
        if (currentDirection == Direction.NORTH)decreaseRowBy(steps-1);
        if (currentDirection == Direction.WEST)decreaseColumnBy(steps-1);
    }

    private void decreaseColumnBy(int steps) {
        if(currentPoint.getColumn()>0){
            getCurrentPosition().setColumn(currentPoint.getColumn()-steps);
        }else{
            throw new IllegalArgumentException("Ijapa ti jabo");
        }
    }

    private void decreaseRowBy(int steps) {
        if(currentPoint.getRow()>0){
            getCurrentPosition().setRow(currentPoint.getRow()-steps);
        }else{
            throw new IllegalArgumentException("Ijapa ti jabo");
        }
    }

    private void increaseColumnBy(int steps) {
        getCurrentPosition().setColumn(currentPoint.getColumn()+steps);
    }


    private void increaseRowBy(int steps) {
//        int myRow = currentPoint.getRow();
//        int newRow = myRow + steps;
//        getCurrentPosition().setRow(newRow);

        getCurrentPosition().setRow(currentPoint.getRow()+steps);
    }
}


