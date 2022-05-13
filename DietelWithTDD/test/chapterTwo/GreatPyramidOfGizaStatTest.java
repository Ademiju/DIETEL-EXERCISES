package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreatPyramidOfGizaStatTest {
    @Test
    public void estimatedStatisticsOfThePyramidCanBeObtainedTest(){
        assertEquals( 2267.96,GreatPyramidOfGizaStat.getEstimatedAverageStoneWeight()) ;
        assertEquals( 2_300_000,GreatPyramidOfGizaStat.getEstimatedNumberOfStone()) ;
        assertEquals( 23,GreatPyramidOfGizaStat.getEstimatedNumberOfYears()) ;
    }
    @Test
    public void weightOfPyramidBuiltEachYearCanBeCalculatedTest(){
        assertEquals(226_796_000,GreatPyramidOfGizaStat.calculateWeightOfPyramidBuiltPerYear());
    }
    @Test
    public void weightOfPyramidBuiltEachHourCanBeCalculatedTest(){
        assertEquals(25889.954337899544,GreatPyramidOfGizaStat.calculateWeightOfPyramidBuiltPerHour());
    }
    @Test
    public void weightOfPyramidBuiltEachMinuteCanBeCalculatedTest(){
        assertEquals(431.4992389649924,GreatPyramidOfGizaStat.calculateWeightOfPyramidBuiltPerMinute());
    }
}
