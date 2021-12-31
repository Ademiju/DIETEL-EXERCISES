package WarmUp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class CalculatorTest {

    @Test
    public void TwoIntegersCanBeAddedTest(){
        Calculator calculate = new Calculator();
        int result = calculate.add(4,6);
        assertEquals(10, result);

    }


}