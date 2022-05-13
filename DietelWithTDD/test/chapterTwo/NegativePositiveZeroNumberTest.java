package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NegativePositiveZeroNumberTest {
    @Test
    public void promptUserTest(){
        assertEquals("Enter an integer",Arithmetic.displayPrompt("Enter an integer"));
    }
    @Test
    public void positiveNumberCanBeObtainedTest(){
        assertTrue(NegativePositiveZeroNumber.isPositive(12));
    }
    @Test
    public void negativeNumberCanBeObtainedTest(){
        assertTrue(NegativePositiveZeroNumber.isNegative(-6));
    }
    @Test
    public void zeroNumberCanBeObtainedTest(){
        assertTrue(NegativePositiveZeroNumber.isZero(0));
    }
    @Test
    public void numberOfPositiveNegativeOrZeroCountOfFiveNumberCanBeObtainedTest(){
        NegativePositiveZeroNumber.checkNumberValue(3,6,0,-3,-1);
        assertEquals(2, NegativePositiveZeroNumber.getPositiveNumber());
        assertEquals(2, NegativePositiveZeroNumber.getNegativeNumber());
        assertEquals(1, NegativePositiveZeroNumber.getZeroNumber());
    }
}
