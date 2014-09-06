package czarn.boardgamecomponets;

import java.util.Random;

/**
 * Class to hold info and functionality
 * of dice in a board game
 *
 * Created by Nick on 8/31/2014.
 */
public class Die {

    /**
     * numberSides - how many sides does the die have?
     */
    private int numberSides;

    /**
     * Create a new die with specified number of sides
     * @param numberOfSides how many sides does the new die have
     */
    public Die(final int numberOfSides) { numberSides = numberOfSides; }

    /**
     * Rolls the die
     * @return number rolled on die
     */
    public int rollDie() {
        return new Random(System.currentTimeMillis()).nextInt() % numberSides + 1;
    }
}
