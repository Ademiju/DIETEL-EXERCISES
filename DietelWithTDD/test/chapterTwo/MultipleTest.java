package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultipleTest {
    @Test
    public void displayPrompt(){
        assertEquals("Enter two integers", Arithmetic.displayPrompt("Enter two integers"));
    }
    @Test
    public void firstNumberCanBeTripledTest(){
        assertEquals(15, Multiple.tripleFirstNumber(5));
    }
    @Test
    public void firstNumberCanBeDoubledTest(){
        assertEquals(30, Multiple.doubleSecondNumber(15));
    }
    @Test
    public void firstNumberTripledIsAMultipleOfSecondNumberDoubleTest(){
        assertTrue(Multiple.isAMultiple(4,2));
    }
    @Test
    public void firstNumberTripledIsNotAMultipleOfSecondNumberDoubleTest(){
        assertFalse(Multiple.isAMultiple(3,5));
    }
}
