package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticSmallestLargestTest {
    @Test
    public void promptUserTest() {
        assertEquals("Enter three integers", Arithmetic.displayPrompt("Enter three integers"));
    }

    @Test
    public void sumOfUserInputCanBeCalculatedTest(){
        assertEquals(15,ArithmeticSmallestLargest.sumOfThreeNumbers(3,5,7));
    }
    @Test
    public void averageOfUserInputCanBeCalculatedTest(){
        assertEquals(5,ArithmeticSmallestLargest.averageOfThreeNumbers(3,5,7));
    }
    @Test
    public void productOfUserInputCanBeCalculatedTest(){
        assertEquals(105,ArithmeticSmallestLargest.productOfThreeNumbers(3,5,7));
    }
    @Test
    public void smallestOfUserInputCanBeCalculatedTest(){
        assertEquals(3,ArithmeticSmallestLargest.smallestOfThreeNumbers(3,5,7));
    }
    @Test
    public void largestOfUserInputCanBeCalculatedTest(){
        assertEquals(7,ArithmeticSmallestLargest.largestOfThreeNumbers(3,5,7));
    }
}

