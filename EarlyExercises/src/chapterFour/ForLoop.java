package chapterFour;

public class ForLoop {
    public static void main(String[] args) {
        int rowLength = 5;




        // Increasing Triangle Pattern (Left-Sided)
//        for(int row = 0; row < rowLength; row++ ){
//            for(int column = 0; column <= row; column++){
//                System.out.print("# ");
//            }
//            System.out.println();
//
//        }


        //Decreasing Triangle pattern (Left-Sided)
//        for( int row =0; row < rowLength; row++){
//            for(int column = row; column < rowLength; column++){
//                System.out.print("# ");
//            }
//            System.out.println();
//        }

        /* Increasing Triangle (Right-Sided):
           this combines a left-Sided decreasing triangle pattern with an increasing triangle pattern */

//        for(int row = 0; row < rowLength; row++){
//            for (int column = row; column < rowLength; column++){
//                System.out.print("   ");
//            }
//            for (int column = 0; column <= row; column++){
//                System.out.print("#  ");
//
//            }
//            System.out.println();
//        }


        /*  Decreasing Triangle (Right-Sided):
            this combines a left-sided increasing triangle pattern with a decreasing triangle pattern*/

//        for(int row = 0; row < rowLength; row++) {
//            for (int column = 0; column <= row; column++) {
//                System.out.print("  ");
//            }
//            for (int column = row; column < rowLength; column++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }



//         Printing all Triangles on a Straight line

//        for(int row = 0; row < rowLength; row++){
//            for(int column = 0; column <= row; column++){
//                System.out.print("  ");
//            }
//            for(int column = row; column < rowLength; column++){
//                System.out.print("* ");
//            }
//            for(int column = row; column < rowLength; column++){
//                System.out.print("  ");
//            }
//            for(int column = 0; column <= row; column++){
//                System.out.print("* ");
//            }
//
//            for(int column = row ; column < rowLength; column++){
//                System.out.print("  ");
//            }
//            for(int column = 0; column <= row; column++){
//                System.out.print("  ");
//            }
//            for(int column = 0; column <= row; column++){
//                System.out.print("* ");
//            }
//            for(int column = row; column < rowLength; column++) {
//                System.out.print("  ");
//            }
//            for(int column = 0; column<=row; column++){
//                System.out.print("  ");
//            }
//            for(int column = row; column < rowLength; column++){
//                System.out.print("  ");
//            }
//            for(int column = row; column < rowLength; column++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //Hill Pattern: Decreasing, Increasing, Increasing

//        for(int row = 0; row < (rowLength-1); row++){
//            for(int column = row; column < rowLength; column++ ){
//                System.out.print("  ");
//            }
//            for(int column = 0; column <= row; column++){
//                System.out.print("* ");
//            }
//            for(int column = 0; column < row; column++){  // column < row instead of column <= row removes one column from the second triangle and makes the hilltop balanced
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        Inverted Hill Pattern: Increasing , Decreasing, Decreasing


//        for(int row = 0; row < rowLength; row++){
//            for(int column = 0; column <= row; column++){
//                System.out.print("  ");
//            }
//            for(int column = row; column < (rowLength-1); column++ ) { // column < rowLength - 1 removes a column from the first triangle and makes the reverse hilltop balanced
//                System.out.print("* ");
//            }
//            for(int column = row; column < rowLength; column++ ){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


    }
}
