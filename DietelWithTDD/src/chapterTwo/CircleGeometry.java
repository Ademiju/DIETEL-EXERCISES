package chapterTwo;

public class CircleGeometry {
    public static int calculateDiameter(int radius) {
        return 2 * radius;
    }

    public static double calculateCircumference(int radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateArea(int radius) {
        return Math.PI * radius * radius;
    }
}
