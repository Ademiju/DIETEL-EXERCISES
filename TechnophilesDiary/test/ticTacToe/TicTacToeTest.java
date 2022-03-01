package ticTacToe;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;
import static ticTacToe.PlayerCharacter.*;


public class TicTacToeTest {
    TicTacToe ticTacToeGame;
    Player player = new Player();
    @BeforeEach
    public void setUp(){
    ticTacToeGame = new TicTacToe(player);
    }
    @Test
    public void ticTacToeCanBeCreatedTest() {
        ticTacToeGame = new TicTacToe(player);
        assertNotNull(ticTacToeGame);
    }

    @Test
    public void ticTacToeGameHasAPlayerOnCreationTest() {
         ticTacToeGame = new TicTacToe(player);
        assertNotNull(player);
         player = ticTacToeGame.getPlayer();
        assertEquals(player, ticTacToeGame.getPlayer());
    }
    @Test
    public void ticTacToeGamePlayerCanSetANameTest(){
        TicTacToe ticTacToeGame = new TicTacToe(player);
        player = ticTacToeGame.setName("Ademiju");
        assertEquals("Ademiju",player.getName());
    }
    @Test
    public void ticTacToeGamePlayerOneCanChooseAGameCharacterTest(){
        TicTacToe ticTacToeGame = new TicTacToe(player);
//        Player player = new Player();
        player.choosePlayerCharacter(X);
        assertSame(X, player.getPlayerCharacter());
        player.choosePlayerCharacter(O);
        assertSame(O,player.getPlayerCharacter());
        Player secondPlayer = new Player();
//        secondPlayer.choosePlayerCharacter(O);
//        assertSame(O,secondPlayer.getPlayerCharacter());
//        Player thirdPlayer = new Player();
    }
    @Test
    public void ticTacToeHasAThreeByThreeBoardTest(){
        TicTacToe ticTacToeGame = new TicTacToe(player);
        PlayerCharacter[][] array = new PlayerCharacter[3][3];
        assertEquals(array, ticTacToeGame.getBoard());
//        ticTacToeGame.playGame();
//        assertEquals(ticTacToeGame);


    }
}

