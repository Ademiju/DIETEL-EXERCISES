package chapterTwo;

public class WorldPopulationGrowthCalculator {
    private static  double worldPopulation = 9.0;
    private static  double annualWorldPopulationGrowthRate = 1.0;

    public static double getWorldPopulation() {
        return worldPopulation;
    }

    public static double getAnnualWorldPopulationGrowthRate() {
        return annualWorldPopulationGrowthRate ;
    }

    public static void setWorldPopulation(double worldPopulation) {
        WorldPopulationGrowthCalculator.worldPopulation = worldPopulation;
    }

    public static void setAnnualWorldPopulationGrowthRate(double growthRate) {
        WorldPopulationGrowthCalculator.annualWorldPopulationGrowthRate =growthRate;
    }

    public static double getEstimatedWorldPopulationAfterYearOne() {
        return worldPopulation * (1 + annualWorldPopulationGrowthRate/100);
    }

    public static double getEstimatedWorldPopulationAfterYearTwo() {
        return worldPopulation * Math.pow(1 + annualWorldPopulationGrowthRate/100,2);
    }

    public static double getEstimatedWorldPopulationAfterYearThree() {
        return worldPopulation * Math.pow(1 + annualWorldPopulationGrowthRate/100,3);
    }

    public static double getEstimatedWorldPopulationAfterYearFour() {
        return worldPopulation * Math.pow(1 + annualWorldPopulationGrowthRate/100,4);
    }

    public static double getEstimatedWorldPopulationAfterYearFive() {
        return worldPopulation * Math.pow(1 + annualWorldPopulationGrowthRate/100,5);
    }
}
