package chapterTwo;

public class GreatPyramidOfGizaStat {
    private static final double AVERAGE_STONE_WEIGHT = 2267.96;
    private static final double ESTIMATED_STONE_USED = 2_300_000 ;
    private static final int ESTIMATED_YEARS_TO_BUILD = 23;
    private static double estimatedWeightPerYear;

    public static double getEstimatedAverageStoneWeight() {
        return AVERAGE_STONE_WEIGHT;
    }

    public static double getEstimatedNumberOfStone() {
        return ESTIMATED_STONE_USED;
    }

    public static int getEstimatedNumberOfYears() {
        return ESTIMATED_YEARS_TO_BUILD;
    }

    public static double calculateWeightOfPyramidBuiltPerYear() {
        estimatedWeightPerYear = AVERAGE_STONE_WEIGHT * ESTIMATED_STONE_USED / ESTIMATED_YEARS_TO_BUILD;
        return estimatedWeightPerYear;
    }

    public static double calculateWeightOfPyramidBuiltPerHour() {
        calculateWeightOfPyramidBuiltPerYear();
        return estimatedWeightPerYear / (365 * 24);
    }

    public static double calculateWeightOfPyramidBuiltPerMinute() {
        calculateWeightOfPyramidBuiltPerYear();
        return estimatedWeightPerYear / (365 * 24 * 60);
    }
}
