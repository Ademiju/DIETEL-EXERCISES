package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisplayShapesWithAsterisksTest {
    @Test
    public void displayBoxShapedAsterisksTest(){
        assertEquals("It's a box", DisplayShapesWithAsterisks.displayBox());
    }
    @Test
    public void displayOvalShapedAsterisksTest(){
        assertEquals("It's an oval", DisplayShapesWithAsterisks.displayOval());
    }

    @Test
    public void displayArrowShapedAsterisksTest(){
        assertEquals("It's an arrow", DisplayShapesWithAsterisks.displayArrow());
    }
    @Test
    public void displayDiamondShapedAsterisksTest(){
        assertEquals("It's a diamond", DisplayShapesWithAsterisks.displayDiamond());
    }


}
