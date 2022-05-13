package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DivisibleBy3Test {
    @Test
    public void displayPrompt(){
        assertEquals("Enter an integer", Arithmetic.displayPrompt("Enter an integer"));
    }
    @Test
    public void check_ifUserInput_isDivisibleBy3Test(){
        assertTrue(DivisibleBy3.isDivisibleByThree(9));
    }
    @Test
    public void check_ifUserInput_isNotDivisibleBy3Test(){
        assertFalse(DivisibleBy3.isDivisibleByThree(11));
    }

}
