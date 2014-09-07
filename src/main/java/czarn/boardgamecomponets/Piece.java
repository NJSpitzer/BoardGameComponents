package czarn.boardgamecomponets;

/**
 * Created by Nick on 9/1/2014.
 */
public abstract class Piece {

    private String ownerName;

    public Piece(final String name) {
        ownerName = name;
    }

    public String getOwnerName() { return ownerName; }
}
