package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ComparingIntegerTest {

    @Test
    public void promptUserTest(){
        assertEquals("Enter an integer",Arithmetic.displayPrompt("Enter an integer"));
    }
    @Test
    public void userInputCanBeSquaredTest(){
        Arithmetic.setFirstUserInput(6);
        assertEquals(36,Arithmetic.squareOfFirstInput());

    }
    @Test
    public void userNumberInputAndItsSquare_GreaterThan_100Test(){
        Arithmetic.setFirstUserInput(101);
        assertEquals("number > 100",ComparingInteger.compareGreaterThan());
        assertEquals("square of number > 100",ComparingInteger.compareSquareGreaterThan());

    }
    @Test
    public void userNumberInputAndItsSquare_LessThan_100Test(){
        Arithmetic.setFirstUserInput(5);
        assertEquals("number < 100",ComparingInteger.compareLessThan());
        assertEquals("square of number < 100",ComparingInteger.compareSquareLessThan());

    }
    @Test
    public void userNumberInputAndItsSquare_EqualTo_100Test(){
        Arithmetic.setFirstUserInput(100);
        assertEquals("number == 100",ComparingInteger.compareEqualTo());
        assertEquals("square of number != 100",ComparingInteger.compareSquareEqualTo());

    }
    @Test
    public void userNumberInputAndItsSquare_NotEqualTo_100Test(){
        Arithmetic.setFirstUserInput(10);
        assertEquals("number != 100",ComparingInteger.compareNotEqualTo());
        assertEquals("square of number == 100",ComparingInteger.compareSquareNotEqualTo());

    }

}
