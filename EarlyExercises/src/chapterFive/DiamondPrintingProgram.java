package chapterFive;

public class DiamondPrintingProgram {
    public static void main(String[] args) {
        int rowLength = 5;
        for (int row = 0; row < (rowLength - 1); row++) {
            for (int column = row; column < rowLength; column++) {
                System.out.print("  ");
            }
            for (int column = 0; column <= row; column++) {
                System.out.print("* ");
            }
            for (int column = 0; column < row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row = 0; row < rowLength; row++){
            for(int column = 0; column <= row; column++){
                System.out.print("  ");
            }
            for(int column = row; column < (rowLength-1); column++ ) {
                System.out.print("* ");
            }
            for(int column = row; column < rowLength; column++ ){
                System.out.print("* ");
            }
            System.out.println();
        }

            }


            }

