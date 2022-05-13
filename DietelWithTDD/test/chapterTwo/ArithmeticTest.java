package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArithmeticTest {
    @Test
    public void promptCanBeDisplayedTest(){
       assertEquals("Enter two integers",Arithmetic.displayPrompt("Enter two integers"));
    }
    @Test
    public void userInputCanBeObtainedTest(){
        Arithmetic.setFirstUserInput(12);
        Arithmetic.setSecondUserInput(20);
        assertEquals(12,Arithmetic.getFirstUserInput());
        assertEquals(20,Arithmetic.getSecondUserInput());
    }
    @Test
    public void squareOfUserFirstInput_CanBePrintedTest(){
        Arithmetic.setFirstUserInput(12);
        assertEquals(144,Arithmetic.squareOfFirstInput());
    }

    @Test
    public void squareOfUserSecondInput_CanBePrintedTest(){
        Arithmetic.setSecondUserInput(20);
        assertEquals(400,Arithmetic.squareOfSecondInput());
    }
    @Test
    public void differenceBetween_squareOfUserInputCanBeCalculatedTest(){
        Arithmetic.setFirstUserInput(20);
        Arithmetic.setSecondUserInput(12);
        assertEquals(256,Arithmetic.squareDifference());
    }


}
