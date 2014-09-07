package czarn.boardgamecomponets.board;

import czarn.boardgamecomponets.Piece;
import czarn.boardgamecomponets.Player;

/**
 * Implementation of BoardSpace abstract class
 * that holds a single piece
 *
 * Created by Nick on 9/6/2014.
 */
public class SinglePieceSpace extends BoardSpace {

    private Piece piece;

    public SinglePieceSpace(final String text) {
        super(text);

        piece = null;
    }

    @Override
    public Piece getPiece(final Player player) { return piece; }
}
