package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMICalculatorTest {
    @Test
    public void takeUserInputTest(){
        BMICalculator.setUserWeightInKilogram(75);
        BMICalculator.setUserHeightInMeter(8);
        assertEquals(75, BMICalculator.getUserWeight());
        assertEquals(8, BMICalculator.getUserHeight());
    }
    @Test
    public void calculateUserBMITest(){
        BMICalculator.setUserWeightInKilogram(75);
        BMICalculator.setUserHeightInMeter(1.5);
        assertEquals(33,BMICalculator.checkBMI());
    }
    @Test
    public void displayUserBMICategoryTest(){
        BMICalculator.setUserWeightInKilogram(75);
        BMICalculator.setUserHeightInMeter(1.5);
        assertEquals("You are OBESE",BMICalculator.checkUserBMICategory());
    }
}
