package czarn.boardgamecomponets.board;

import czarn.boardgamecomponets.Piece;
import czarn.boardgamecomponets.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to hold the data and
 * functionality of a board's space
 *
 * Created by Nick on 8/30/2014.
 */
public abstract class BoardSpace {

    private List<Piece> pieces;
    private String spaceText;

    public BoardSpace(final String text) {
        pieces = new ArrayList<Piece>();
        spaceText = text;
    }

    /**
     * @return text on a space
     */
    public String getSpaceText() {
        return spaceText;
    }

    /**
     * Return the piece on the space
     */
    public Piece getPiece() {
        return null;
    }
}
