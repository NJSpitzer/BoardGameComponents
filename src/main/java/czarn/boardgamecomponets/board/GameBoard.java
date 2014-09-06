package czarn.boardgamecomponets.board;

import czarn.boardgamecomponets.Die;

import java.util.List;

/**
 * Object to hold the data and
 * functionality of the game board
 *
 * Created by Nick on 8/30/2014.
 */
public abstract class GameBoard {

    private Die[] dice;

    public GameBoard(final int numberOfDice) {
        dice = new Die[numberOfDice];
    }

    public abstract void movePlayer();
}
