package chapterTwo;

public class SquareAndCubeTable {
    public static int squareOfNumber(int number) {
    return number * number;
    }

    public static int cubeOfNumber(int number) {
    return number * number * number;
    }

    public static void displaySquareAndCube() {
        System.out.println("number  square  cube");
        for(int i = 0; i<= 10; i++){
            System.out.printf("%d%8d%9d",i,squareOfNumber(i),cubeOfNumber(i));
            System.out.println();
        }

    }
}
