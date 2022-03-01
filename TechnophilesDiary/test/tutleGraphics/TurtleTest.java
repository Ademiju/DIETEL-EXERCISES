package tutleGraphics;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import static tutleGraphics.PenState.*;

public class TurtleTest {

    @Test
    public void turtleExistTest() {
        Turtle turtle = new Turtle();
        assertNotNull(turtle);
    }

    @Test
    public void turtleHasAPenTest() {
        Pen pen = new Pen();
        assertNotNull(pen);
    }

    @Test
    public void penIsUpByDefaultTest() {
        Turtle turtle = new Turtle();
        Pen pen = turtle.getPen();
        assertSame(pen.getState(), UP);
    }

    @Test
    public void turtleCanMovePenDownTest() {
        Turtle turtle = new Turtle();
        Pen smartLeo = turtle.getPen();
        assertSame(smartLeo.getState(), UP);
        turtle.penDown();
        assertSame(smartLeo.getState(), DOWN);

    }

    @Test
    public void turtleCanMovePenUpTest() {
        Turtle turtle = new Turtle();
        Pen smartLeo = turtle.getPen();
        turtle.penDown();
        assertSame(smartLeo.getState(), DOWN);
        turtle.penUp();
        assertSame(smartLeo.getState(), UP);
    }

    @Test
    public void turtleCanTurnRight_whileFacingEastTest() {
        Turtle turtle = new Turtle();
        assertSame(turtle.direction(), Direction.EAST);
        turtle.turnRight();
        assertSame(Direction.SOUTH, turtle.direction());
    }

    @Test
    public void turtleCanTurnRight_whileFacingSouthTest() {
        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(Direction.WEST, turtle.direction());
    }

    @Test
    public void turtleCanTurnRight_whileFacingWestTest() {
        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(Direction.NORTH, turtle.direction());
    }

    @Test
    public void turtleCanTurnRight_whileFacingNorthTest() {
        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(Direction.EAST, turtle.direction());

    }

    @Test
    public void turtleCanTurnLeft_whileFacingEastTest() {
        Turtle turtle = new Turtle();
        assertSame(turtle.direction(), Direction.EAST);
        turtle.turnLeft();
        assertSame(Direction.NORTH, turtle.direction());
    }

    @Test
    public void turtleCanTurnLeft_whileFacingNorthTest() {
        Turtle turtle = new Turtle();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(Direction.WEST, turtle.direction());

    }

    @Test
    public void turtleCanTurnLeft_whileFacingWestTest() {
        Turtle turtle = new Turtle();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(Direction.SOUTH, turtle.direction());

    }

    @Test
    public void turtleCanTurnLeft_whileFacingSouthTest() {
        Turtle turtle = new Turtle();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(Direction.EAST, turtle.direction());

    }

    @Test
    public void turtleCanMove_whileFacingEastTest() {
        Turtle turtle = new Turtle();
        assertSame(Direction.EAST, turtle.direction());
        turtle.move(5);
        turtle.move(8);
        Point position = new Point(0, 11);
        assertEquals(position, turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanMove_whileFacingSouthTest() {
        Turtle turtle = new Turtle();
        turtle.turnRight();
        assertSame(Direction.SOUTH, turtle.direction());
        turtle.move(8);
        Point position = new Point(7, 0);
        assertEquals(position, turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanMove_whileFacingNorthTest() {
        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.move(8);
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(Direction.NORTH, turtle.direction());
        turtle.move(9);
        Point position = new Point(-1, 0);
        assertEquals(position, turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanMove_whileFacingWestTest() {
        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.move(8);
        turtle.turnLeft();
        turtle.move(12);
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(Direction.WEST, turtle.direction());
        turtle.move(9);
        Point position = new Point(7,3);
        assertEquals(position,turtle.getCurrentPosition());
    }
    @Test
    public void turtleThrowException_whenRowIsZero_whileFacingNorthTest(){
        Turtle turtle = new Turtle();
        turtle.turnLeft();
        assertSame(Direction.NORTH, turtle.direction());
        try {
            turtle.move(6);
        }catch (Exception ex) {
            assertEquals(IllegalArgumentException.class, ex.getClass());
            assertEquals("Ijapa ti jabo", ex.getMessage());
        }
    }
    @Test
    public void turtleThrowException_whenColumnIsZero_whileFacingWestTest(){
        Turtle turtle = new Turtle();
        turtle.turnLeft();
        assertSame(Direction.NORTH, turtle.direction());
        try {
            turtle.move(6);
        }catch (Exception ex) {
            assertEquals(IllegalArgumentException.class, ex.getClass());
            assertEquals("Ijapa ti jabo", ex.getMessage());
        }
    }
}