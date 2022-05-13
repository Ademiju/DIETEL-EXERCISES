package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckerBoardPatternTest {
    @Test
    public void displayCheckerBoardPatternTest(){
        assertEquals("It's a CheckerBoard Pattern",CheckerBoardPattern.displayCheckerBoard());
    }
}
