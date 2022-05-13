package chapterTwo;

public class SeparatingInteger {
    private static int fiveDigitNumber;

    public static void setUserInput(int fiveDigitNumber) {
        SeparatingInteger.fiveDigitNumber = fiveDigitNumber;
    }
    public static int getUserInput() {
        return fiveDigitNumber;
    }

    public static int getFirstNumber() {
       int fourDigitRemainder = fiveDigitNumber/10;
        int threeDigitRemainder = fourDigitRemainder /10;
        int twoDigitRemainder = threeDigitRemainder / 10;
        return twoDigitRemainder / 10;
    }

    public static int getSecondNumber() {
        int fourDigitRemainder = fiveDigitNumber/10;
        int threeDigitRemainder = fourDigitRemainder /10;
        int twoDigitRemainder = threeDigitRemainder / 10;
        return twoDigitRemainder % 10;
    }

    public static int getThirdNumber() {
        int fourDigitRemainder = fiveDigitNumber/10;
        int threeDigitRemainder = fourDigitRemainder /10;
        return threeDigitRemainder % 10;
    }

    public static int getFourthNumber() {
       int fourDigitRemainder = fiveDigitNumber/10;
        return fourDigitRemainder % 10;
    }

    public static int getFifthNumber() {
        return fiveDigitNumber % 10;
    }
}
