package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeparatingIntegerTest {
    @Test
    public void promptUserTest(){
        assertEquals("Enter a five digit integer",Arithmetic.displayPrompt("Enter a five digit integer"));
    }
    @Test
    public  void  userCanInputFiveDigitNumberTest(){
        SeparatingInteger.setUserInput(42339);
        assertEquals(42339,SeparatingInteger.getUserInput());
    }
    @Test
    public void fiveDigitIntegerCanBeSeperatedTest(){
        SeparatingInteger.setUserInput(42339);

        assertEquals(4,SeparatingInteger.getFirstNumber());
        assertEquals(2,SeparatingInteger.getSecondNumber());
        assertEquals(3,SeparatingInteger.getThirdNumber());
        assertEquals(3,SeparatingInteger.getFourthNumber());
        assertEquals(9,SeparatingInteger.getFifthNumber());
    }

}
