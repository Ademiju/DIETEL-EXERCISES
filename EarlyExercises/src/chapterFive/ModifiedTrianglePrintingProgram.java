package chapterFive;

public class ModifiedTrianglePrintingProgram {
    public static void main(String[] args) {
        int rowLength = 5;
        for(int row = 0;row<rowLength; row++){
            for(int column=0; column<= row; column++) {
                System.out.print("* ");
            }
            for(int column = row; column < rowLength; column++ ){
                        System.out.print("  ");
            }
            for(int column = row; column < rowLength; column++){
                System.out.print("* ");
            }
            for(int column = 0; column <= row; column++){
                System.out.print("  ");
            }
            for(int column = row; column < rowLength; column++ ){
                System.out.print("  ");
            }
            for(int column = 0; column <= row; column++){
                System.out.print("* ");
            }
            for(int column = 0; column <= row; column++){
                System.out.print("  ");
            }
            for(int column = row; column < rowLength; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
