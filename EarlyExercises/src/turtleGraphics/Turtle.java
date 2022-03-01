package turtleGraphics;

import static turtleGraphics.Direction.*;

public class Turtle {
    private Pen biro = new Pen();
    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0,0);
    public Pen getPen() {
        return biro;

    }

    public void penDown() {

        biro.setState(PenState.DOWN);
    }

    public void penUp() {
        biro.setState(PenState.UP);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }
    public void turnRight(){
        if(currentDirection == SOUTH)face(WEST);
        else if(currentDirection == EAST) face(SOUTH);
        else if(currentDirection == NORTH) face(EAST);
        else if(currentDirection == WEST) face (NORTH);

    }

    private void face(Direction direction) {
        currentDirection = direction;
    }

    public void turnLeft() {
        if(currentDirection == EAST)face(NORTH);
        else if(currentDirection == NORTH) face(WEST);
        else if(currentDirection == WEST) face(SOUTH);
        else if(currentDirection == SOUTH) face (EAST);
    }

    public void moveWithoutWriting(int numberOfSteps) {

        if(currentDirection == EAST) increaseColumnBy(numberOfSteps-1);
        if(currentDirection == SOUTH)increaseRowBy(numberOfSteps-1);
        if(currentDirection == WEST)decreaseColumnBy(numberOfSteps-1);
        if(currentDirection == NORTH)decreaseRowBy(numberOfSteps-1);

    }

    private void decreaseRowBy(int number) {
        currentPosition.setRow(currentPosition.getRow()-number);
    }

    private void decreaseColumnBy(int number) {
        currentPosition.setColumn(currentPosition.getColumn()-number);
    }

    private void increaseRowBy(int increase) {
        currentPosition.setRow(currentPosition.getRow()+increase);
    }

    private void increaseColumnBy(int increase) {
        currentPosition.setColumn(currentPosition.getColumn()+increase);

    }

    public Position getCurrentPosition(){
        return currentPosition;
    }

    public void move(int numberOfSteps, SketchPad sketchPad) {
        validateMove(numberOfSteps, sketchPad);
        if(biro.getState().equals(PenState.DOWN)){
            write(numberOfSteps,sketchPad);
        }
        moveWithoutWriting(numberOfSteps);

    }

    private void validateMove(int numberOfSteps, SketchPad sketchPad) {
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        switch (currentDirection){
            case EAST : {
                if(column + numberOfSteps > sketchPad.getFloor()[row].length) throw new InvalidMoveException("Ijapa don fall");
            }
            break;

            case SOUTH:{
                if(row + numberOfSteps > sketchPad.getFloor().length) throw new InvalidMoveException("Ijapa don fall");
            }
            break;

            case NORTH:{
                if(row - numberOfSteps+1 < 0) throw new InvalidMoveException("Ijapa don fall");
            }
            break;

            case WEST: {
                if(column - numberOfSteps+1 < 0) throw new InvalidMoveException("Ijapa don fall");
            }


            }
        }


    private void write(int numberOfSteps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        switch (currentDirection){
        case EAST: {
            for(int i = column; i < column+numberOfSteps; i++ ){
                floor[row][i] = 1;
            }
            break;
        }
            case SOUTH:{
                for(int i = row; i < row+numberOfSteps; i++){
                    floor[i][column] = 1;
                }
            }
            break;

            case NORTH:{
                for (int i = row; i >= floor.length - numberOfSteps ; i--){
                    floor[i][column] = 1;
                }
            }
            break;

            case WEST:{
                for (int i = column; i >= floor[row].length - numberOfSteps ; i--){
                    floor[row][i] = 1;
                }
            }
            break;
        }

        }

    }