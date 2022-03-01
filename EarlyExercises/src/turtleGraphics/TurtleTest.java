package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static turtleGraphics.Direction.*;
import static turtleGraphics.PenState.*;

class TurtleTest {

    Turtle ijapa;
    @BeforeEach
    public void setUp() {
        ijapa = new Turtle();
    }

    @Test
    public void turtleExist() {
        Turtle ijapa = new Turtle();
        assertNotNull(ijapa);
    }

    @Test
    public void turtleHasAPenTest() {
        Turtle ijapa = new Turtle();
        Pen pen = ijapa.getPen();
        assertNotNull(pen);
    }

    @Test
    public void penIsUpByDefaultTest() {
        Turtle ijapa = new Turtle();
        Pen pen = ijapa.getPen();
        assertEquals(pen.getState(), UP);
    }

    @Test
    public void turtleCanMovePenDown() {
        Turtle ijapa = new Turtle();
        Pen pen = ijapa.getPen();
        //GIVEN
        assertSame(ijapa.getPen().getState(), UP);
        //WHEN
        ijapa.penDown();
        //ASSERT
        assertSame(ijapa.getPen().getState(), DOWN);
        //Instead of repeatiine PenState.UP Or PenState.DOWN... WE CAN IMPORT THE STATIC CLASS AND JUST WRITE DOWN OR UP

    }
    @Test
    public void turtleCanMovePenUp() {
        // given
        ijapa.penDown();
        assertSame(ijapa.getPen().getState(), DOWN);
        //WHEN
        ijapa.penUp();
        //assert
        assertSame(ijapa.getPen().getState(), UP);
    }@Test
    public void turtleCanTurnRight_whileFacingEastTest(){
        assertSame(ijapa.getCurrentDirection(), EAST);
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(), SOUTH);
    }

    @Test
    public void turtleCanTurnRight_whileFacingSouthTest() {
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(), SOUTH);
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRight_whileFacingWestTest(){
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(),NORTH);
    }
    @Test
    public void turtleCanTurnRight_whileFacingNorthTest(){
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(NORTH,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(EAST,ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeft_whileFacingEastTest() {
        assertSame(ijapa.getCurrentDirection(), EAST);
        ijapa.turnLeft();
        assertSame(ijapa.getCurrentDirection(), NORTH);
    }
    @Test
    public void turtleCanTurnLeft_whileFacingWestTest() {
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(), WEST);
        ijapa.turnLeft();
        assertSame(ijapa.getCurrentDirection(), SOUTH);
    }
    @Test
    public void turtleCanTurnLeft_whileFacingNorthTest() {
        ijapa.turnLeft();
        assertSame(ijapa.getCurrentDirection(), NORTH);
        ijapa.turnLeft();
        assertSame(ijapa.getCurrentDirection(), WEST);
    }
    @Test
    public void turtleCanTurnLeft_whileFacingSouthTest() {
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(), SOUTH);
        ijapa.turnLeft();
        assertSame(ijapa.getCurrentDirection(), EAST);
    }
    @Test
    public void turtleCanMove_whileFacingEastTest(){
        ijapa.moveWithoutWriting(5);
        ijapa.moveWithoutWriting(6);
        Position expected = new Position(0,9);
        assertEquals(expected, ijapa.getCurrentPosition());
    }

    @Test
    public void turtleCanMove_whileFacingSouthTest(){
        ijapa.turnRight();
        ijapa.moveWithoutWriting(6);
        Position expected = new Position(5,0);
        assertEquals(expected, ijapa.getCurrentPosition());
    }

    @Test
    public void turtleCanMove_whileFacingWestTest(){
        ijapa.moveWithoutWriting(6);
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(), WEST);
        ijapa.moveWithoutWriting(6);
        Position expected = new Position(0,0);
        assertEquals(expected, ijapa.getCurrentPosition());
    }
    @Test
    public void turtleCanMove_whileFacingNorthTest(){
        ijapa.turnRight();
        ijapa.moveWithoutWriting(6);
        ijapa.turnLeft();
        ijapa.moveWithoutWriting(5);
        ijapa.turnLeft();
        ijapa.moveWithoutWriting(3);
        Position expected = new Position(3,4);
        assertEquals(expected, ijapa.getCurrentPosition());
    }@Test
    public void turtleCanWrite_whenPenIsDown(){
        ijapa.penDown();
        SketchPad pad = new SketchPad(5,5);
        ijapa.move(5,pad);
        assertEquals(new Position(0,4), ijapa.getCurrentPosition());
        assertEquals(1,pad.getFloor()[0][0]);
        assertEquals(1,pad.getFloor()[0][1]);
        assertEquals(1,pad.getFloor()[0][2]);
        assertEquals(1,pad.getFloor()[0][3]);
        assertEquals(1,pad.getFloor()[0][4]);
        assertEquals(new Position(0,4), ijapa.getCurrentPosition());
        pad.display();

    }
@Test
public void turtleCanWrite_whenPenIsDown_whileFacingEast(){
    ijapa.penDown();
    assertSame(ijapa.getCurrentDirection(), EAST);
    SketchPad pad = new SketchPad(5,5);
    ijapa.move(5,pad);
//    assertEquals(new Position(0,4), ijapa.getCurrentPosition());
    assertEquals(1,pad.getFloor()[0][0]);
    assertEquals(1,pad.getFloor()[0][1]);
    assertEquals(1,pad.getFloor()[0][2]);
    assertEquals(1,pad.getFloor()[0][3]);
    assertEquals(1,pad.getFloor()[0][4]);
    assertEquals(new Position(0,4), ijapa.getCurrentPosition());
    pad.display();

}
    @Test
    public void turtleCanWrite_whenPenIsDown_whileFacingSouth(){
        ijapa.penDown();
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(), SOUTH);
        SketchPad pad = new SketchPad(5,5);
        ijapa.move(5,pad);
        assertEquals(1,pad.getFloor()[0][0]);
        assertEquals(1,pad.getFloor()[1][0]);
        assertEquals(1,pad.getFloor()[2][0]);
        assertEquals(1,pad.getFloor()[3][0]);
        assertEquals(1,pad.getFloor()[4][0]);
        assertEquals(new Position(4,0), ijapa.getCurrentPosition());
        pad.display();

    }
    @Test
    public void turtleCanWrite_whenPenIsDown_whileFacingNorth() {
        ijapa.penDown();
        SketchPad pad = new SketchPad(5, 5);
        ijapa.move(4, pad);
        assertEquals(new Position(0, 3), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.move(5, pad);
        ijapa.turnLeft();
        ijapa.move(2, pad);
        assertEquals(new Position(4, 4), ijapa.getCurrentPosition());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.move(5, pad);
        assertEquals(1, pad.getFloor()[4][4]);
        assertEquals(1, pad.getFloor()[3][4]);
        assertEquals(1, pad.getFloor()[2][4]);
        assertEquals(1, pad.getFloor()[1][4]);
        assertEquals(1, pad.getFloor()[0][4]);
//        assertEquals(new Position(0, 4), ijapa.getCurrentPosition());
        pad.display();
    }
        @Test
        public void turtleCanWrite_whenPenIsDown_whileFacingWest(){
            ijapa.penDown();
            SketchPad pad = new SketchPad(5,5);
            ijapa.move(5,pad);
            assertEquals(new Position(0,4), ijapa.getCurrentPosition());
            ijapa.turnRight();
            ijapa.move(4,pad);
            ijapa.turnRight();
            assertSame(WEST, ijapa.getCurrentDirection());
            assertEquals(new Position(3,4), ijapa.getCurrentPosition());
            ijapa.move(5,pad);
            assertEquals(1,pad.getFloor()[3][4]);
            assertEquals(1,pad.getFloor()[3][3]);
            assertEquals(1,pad.getFloor()[3][2]);
            assertEquals(1,pad.getFloor()[3][1]);
            assertEquals(1,pad.getFloor()[3][0]);
//        assertEquals(1,pad.getFloor()[1][3]);
            pad.display();

    }
    @Test
    public void whenTurtleGoesOutOfSketchpad_whileFacingEast_exceptionIsThrown(){
        ijapa.penDown();
        SketchPad sketchPad = new SketchPad(5,5);
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.move(3,sketchPad);
        assertThrows(InvalidMoveException.class,()-> ijapa.move(5,sketchPad));
//        try{
//            ijapa.move(5,sketchPad);
//        }catch(InvalidMoveException ex){
//            assertEquals(InvalidMoveException.class, ex.getClass());
//            assertEquals("Ijapa don fall", ex.getMessage());
//        }
    }
    @Test
    public void whenTurtleGoesOutOfSketchpad_whileFacingSouth_exceptionIsThrown() {
        ijapa.penDown();
        SketchPad sketchPad = new SketchPad(5, 5);
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
//        ijapa.move(6, sketchPad);
//        assertThrows(InvalidMoveException.class, () -> ijapa.move(6, sketchPad));
        try{
            ijapa.move(6,sketchPad);
        }catch(InvalidMoveException ex){
            assertEquals(InvalidMoveException.class, ex.getClass());
            assertEquals("Ijapa don fall", ex.getMessage());
        }
    }
    @Test
    public void whenTurtleGoesOutOfSketchpad_whileFacingWest_exceptionIsThrown() {
        ijapa.penDown();
        SketchPad sketchPad = new SketchPad(5, 5);
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
//        ijapa.move(6, sketchPad);
//        assertThrows(InvalidMoveException.class, () -> ijapa.move(6, sketchPad));
        try{
            ijapa.move(2,sketchPad);
        }catch(InvalidMoveException ex){
            assertEquals(InvalidMoveException.class, ex.getClass());
            assertEquals("Ijapa don fall", ex.getMessage());
        }
    }
    @Test
    public void whenTurtleGoesOutOfSketchpad_whileFacingNorth_exceptionIsThrown() {
        ijapa.penDown();
        SketchPad sketchPad = new SketchPad(5, 5);
        ijapa.turnRight();
        ijapa.move(4,sketchPad);
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
//        ijapa.move(5, sketchPad);
//        sketchPad.display();
//        assertThrows(InvalidMoveException.class, () -> ijapa.move(5, sketchPad));
        try{
            ijapa.move(6,sketchPad);
        }catch(InvalidMoveException ex){
            assertEquals(InvalidMoveException.class, ex.getClass());
//            assertEquals("Ijapa don fall", ex.getMessage());
        }
    }

}
