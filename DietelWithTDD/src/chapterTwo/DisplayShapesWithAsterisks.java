package chapterTwo;

public class DisplayShapesWithAsterisks {
    public static String displayBox() {
        System.out.println("*********");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*********");
        return "It's a box";
    }

    public static String displayOval() {
        System.out.println("    ***     ");
        System.out.println(" *       *  ");
        System.out.println("*          *");
        System.out.println("*          *");
        System.out.println("*          *");
        System.out.println("*          *");
        System.out.println("*          *");
        System.out.println(" *       *  ");
        System.out.println("    ***     ");

        return "It's an oval";
    }

    public static String displayArrow() {
        System.out.println("    *       ");
        System.out.println("   ***      ");
        System.out.println("  *****     ");
        System.out.println("    *       ");
        System.out.println("    *       ");
        System.out.println("    *       ");
        System.out.println("    *       ");
        System.out.println("    *       ");
        System.out.println("    *       ");

        return "It's an arrow";
    }

    public static String displayDiamond() {
        System.out.println("    *       ");
        System.out.println("   * *      ");
        System.out.println("  *   *     ");
        System.out.println(" *     *    ");
        System.out.println("*       *   ");
        System.out.println(" *     *    ");
        System.out.println("  *   *     ");
        System.out.println("   * *      ");
        System.out.println("    *       ");
        return "It's a diamond";
    }
}
