package ChapterTwo;

public class PowerTable {
    /*2.31 (Table of Squares and Cubes) Using only the programming techniques you learned in this chapter,
    write an application that calculates the squares and cubes of the numbers from 0 to 10 and prints the resulting values in table format,
    as shown below.

    number  square  cube
0       0       0
        1       1       1
        2       4       8
        3       9       27
        4       16      64
        5       25      125
        6       36      216
        7       49      343
        8       64      512
        9       81      729
        10      100     1000

    ANSWER:
*/

    public static void main(String[]args){

        int num;
        int numSquare;
        int numCube;

        System.out.println("number\tSquare\tCube");
        num = 0;
        numSquare = num * num;
        numCube = num * num * num;
        System.out.printf("%d\t%d\t%d%n", num,numSquare,numCube);

        num = 1;
        numSquare = num * num;
        numCube = num * num * num;
        System.out.printf("%d\t%d\t%d%n", num,numSquare,numCube);

        num = 2;
        numSquare = num * num;
        numCube = num * num * num;
        System.out.printf("%d\t%d\t%d%n", num,numSquare,numCube);

        num = 3;
        numSquare = num * num;
        numCube = num * num * num;
        System.out.printf("%d\t%d\t%d%n", num,numSquare,numCube);

        num = 4;
        numSquare = num * num;
        numCube = num * num * num;
        System.out.printf("%d\t%d\t%d%n", num,numSquare,numCube);

        num = 5;
        numSquare = num * num;
        numCube = num * num * num;
        System.out.printf("%d\t%d\t%d%n", num,numSquare,numCube);

        num = 6;
        numSquare = num * num;
        numCube = num * num * num;
        System.out.printf("%d\t%d\t%d%n", num,numSquare,numCube);

        num = 7;
        numSquare = num * num;
        numCube = num * num * num;
        System.out.printf("%d\t%d\t%d%n", num,numSquare,numCube);

        num = 8;
        numSquare = num * num;
        numCube = num * num * num;
        System.out.printf("%d\t%d\t%d%n", num,numSquare,numCube);

        num = 9;
        numSquare = num * num;
        numCube = num * num * num;
        System.out.printf("%d\t%d\t%d%n", num,numSquare,numCube);

        num = 10;
        numSquare = num * num;
        numCube = num * num * num;
        System.out.printf("%d\t%d\t%d%n", num,numSquare,numCube);
    }


}
