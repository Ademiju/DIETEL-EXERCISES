package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestAndSmallestIntegerTest {
    @Test
    public void displayPrompt(){
    assertEquals("Enter five integers",Arithmetic.displayPrompt("Enter five integers"));

    }
    @Test
    public void largestNumberOfFiveIntegerCanBePrintedTest(){
        assertEquals(19,LargestAndSmallestInteger.largestOfFiveIntegers(3,7,9,19,10));
    }
    @Test
    public void smallestNumberOfFiveIntegerCanBePrintedTest(){
        assertEquals(7,LargestAndSmallestInteger.smallestOfFiveIntegers(15,7,9,19,10));
    }



}
