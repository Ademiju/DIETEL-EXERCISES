package ticTacToe;

public class Player {
    private String name;
    public  PlayerCharacter playerCharacter;


    public PlayerCharacter getPlayerCharacter() {
        return playerCharacter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }

    public void choosePlayerCharacter(PlayerCharacter character) {
       playerCharacter = character;
    }
}
