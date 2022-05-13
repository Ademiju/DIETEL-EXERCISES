package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldPopulationGrowthCalculatorTest {
    @Test
    public void checkWorldPopulationTest() {
        WorldPopulationGrowthCalculator.setWorldPopulation(9.0);
        assertEquals(9.0, WorldPopulationGrowthCalculator.getWorldPopulation());
    }

    @Test
    public void checkWorldPopulationGrowthRateTest() {
        WorldPopulationGrowthCalculator.setAnnualWorldPopulationGrowthRate(1.0);
        assertEquals(1.0, WorldPopulationGrowthCalculator.getAnnualWorldPopulationGrowthRate());
    }
@Test
    public void checkEstimatedWorldPopulationOfNextFiveYearsTest(){
    WorldPopulationGrowthCalculator.setWorldPopulation(9.0);
    WorldPopulationGrowthCalculator.setAnnualWorldPopulationGrowthRate(1.0);
    assertEquals(9.09,WorldPopulationGrowthCalculator.getEstimatedWorldPopulationAfterYearOne());
    assertEquals(9.1809,WorldPopulationGrowthCalculator.getEstimatedWorldPopulationAfterYearTwo());
    assertEquals(9.272709,WorldPopulationGrowthCalculator.getEstimatedWorldPopulationAfterYearThree());
    assertEquals(9.365436090,WorldPopulationGrowthCalculator.getEstimatedWorldPopulationAfterYearFour());
    assertEquals(9.459090450900002,WorldPopulationGrowthCalculator.getEstimatedWorldPopulationAfterYearFive());

}
}
