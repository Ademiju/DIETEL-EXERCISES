package chapterTwo;


public class ComparingInteger {

    public static String compareGreaterThan() {
        if (Arithmetic.getFirstUserInput() > 100) {
            return "number > 100";
        }
            return "number < 100";

    }

    public static String compareSquareGreaterThan() {
        if(Arithmetic.squareOfFirstInput() > 100) {
            return "square of number > 100";
        }
        return "square of number < 100";
    }

    public static String compareLessThan() {
        if (Arithmetic.getFirstUserInput() < 100) {
            return "number < 100";
        }
        return "number > 100";

    }

    public static String compareSquareLessThan() {
        if(Arithmetic.squareOfFirstInput() < 100) {
            return "square of number < 100";
        }
        return "square of number > 100";
    }

    public static String compareEqualTo() {
        if (Arithmetic.getFirstUserInput() == 100) {
            return "number == 100";
        }
        return "number != 100";
    }

    public static String compareSquareEqualTo() {
        if(Arithmetic.squareOfFirstInput() == 100) {
            return "square of number == 100";
        }
        return "square of number != 100";
    }

    public static String compareNotEqualTo() {
        if (Arithmetic.getFirstUserInput() != 100) {
            return "number != 100";
        }
        return "number == 100";
    }

    public static String compareSquareNotEqualTo() {
        if(Arithmetic.squareOfFirstInput() != 100) {
            return "square of number != 100";
        }
        return "square of number == 100";
    }
}
