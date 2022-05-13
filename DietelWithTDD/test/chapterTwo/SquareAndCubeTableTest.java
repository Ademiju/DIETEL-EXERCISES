package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareAndCubeTableTest {
    @Test
    public void numbersCanBeSquaredTest(){
        assertEquals(25,SquareAndCubeTable.squareOfNumber(5));
        assertEquals(81,SquareAndCubeTable.squareOfNumber(9));
    }
    @Test
    public void numbersCanBeCubedTest(){
        assertEquals(27,SquareAndCubeTable.cubeOfNumber(3));
        assertEquals(125,SquareAndCubeTable.cubeOfNumber(5));
    }
    @Test
    public void squaresAndCubesOfNumbersZeroThroughTenCanBeDisplayed(){
        SquareAndCubeTable.displaySquareAndCube();
    }
}
