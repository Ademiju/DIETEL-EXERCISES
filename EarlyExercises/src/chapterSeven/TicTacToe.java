package chapterSeven;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] ticTacToe = {{'X', 'O', 'O'}, {'X', 'X', 'X',}, {'O', 'X', 'O'}};
        System.out.println(ticTacToe[0][0] + " " + ticTacToe[0][1] + " " + ticTacToe[0][2]);
        System.out.println(ticTacToe[1][0] + " " + ticTacToe[1][1] + " " + ticTacToe[1][2]);
        System.out.println(ticTacToe[2][0] + " " + ticTacToe[2][1] + " " + ticTacToe[2][2]);
        int counter = 0;
        int counter1 = 1;
        int counter2 = 2;
        System.out.println();
        for (int count = 0; count < ticTacToe.length; count++) {
            System.out.print(ticTacToe[counter][count] + " ");
        }
        System.out.println();
        for (int count = 0; count < ticTacToe.length; count++) {
            System.out.print(ticTacToe[counter1][count] + " ");
        }
        System.out.println();

        for (int count = 0; count < ticTacToe.length; count++) {
            System.out.print(ticTacToe[counter2][count] + " ");

        }
        System.out.println();
        System.out.println();

        for(int count = 0; count < ticTacToe.length; count++){
            for(counter =0; counter< ticTacToe[count].length; counter++)
                System.out.print(ticTacToe[count][counter]+ " ");
            System.out.println();

        }

    }
}
