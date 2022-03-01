package ticTacToe;

public class TicTacToe {
    private final Player player[] = new Player[2];
   private  PlayerCharacter ticTacToeBoard[][] = new PlayerCharacter[3][3];

    public TicTacToe(Player playerOne) {
        player[0] = playerOne;

    }

    public Player setName(String playerName) {
        player[0].setName(playerName);
        return player[0];
    }

    public Player getPlayer() {
        return player[0];
    }

    public void playGame() {

//        for (int row = 0; row < ticTacToeBoard.length; row++) {
//            for (int column = 0; column < ticTacToeBoard[row].length; column++) {
//                ticTacToeBoard[row][column] = PlayerCharacter.EMPTY;
//            }
//        }
//        for (int row = 0; row < ticTacToeBoard.length; row++) {
//            for (int column = 0; column < ticTacToeBoard[row].length; column++) {
//                System.out.print( ticTacToeBoard[row][column] + "   ");
//            }
//            System.out.println();
//        }
    }

    public PlayerCharacter[][] getBoard() {
        return ticTacToeBoard;

    }
}


