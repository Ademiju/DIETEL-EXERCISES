package chapterTwo;

public class BMICalculator {
    private static int weight;
    private static double height;
    private static int bmi;

    public static void setUserWeightInKilogram(int weight) {
        BMICalculator.weight = weight;
    }

    public static int getUserWeight() {
        return weight;
    }

    public static void setUserHeightInMeter(double height) {
        BMICalculator.height = height;
    }

    public static double getUserHeight() {
        return height;
    }

    public static int checkBMI() {
        bmi = (int) (weight /(height*height));
        return bmi;
    }

    public static String checkUserBMICategory() {
        checkBMI();
        if(bmi < 18.5){
            return "You are UNDERWEIGHT";
        }

        if (bmi >= 18.5){
            if (bmi <= 24.9){
                return "You are NORMAL weight";
            }
        }


        if (bmi >= 25){
            if (bmi <= 29.9){
                return "You are OVERWEIGHT";
            }
        }


        if (bmi >= 30){

            return "You are OBESE";
        }

        return null;
    }
}
