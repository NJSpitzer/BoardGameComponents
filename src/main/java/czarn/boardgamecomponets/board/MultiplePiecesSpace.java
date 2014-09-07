package czarn.boardgamecomponets.board;

import czarn.boardgamecomponets.Piece;
import czarn.boardgamecomponets.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nick on 9/6/2014.
 */
public class MultiplePiecesSpace extends BoardSpace {

    private List<Piece> pieces;

    public MultiplePiecesSpace(final String text) {
        super(text);

        pieces = new ArrayList<Piece>();
    }

    @Override
    public Piece getPiece(final Player player) {

        for (Piece piece : pieces){
            if (piece.getOwnerName().equals(player.getName()))
                return piece;
        }
        return null;
    }
}
