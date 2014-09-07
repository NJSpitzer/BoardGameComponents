package czarn.boardgamecomponets;

/**
 * Object to hold data about cards in
 * a board game
 *
 * Created by Nick on 8/31/2014.
 */
public abstract class Card {

    private String cardTitle;
    private String cardText;

    public Card(final String title, final String text) {
        cardTitle = title;
        cardText = text;
    }

    public String getCardTitle() { return cardTitle; }

    public String getCardText() { return cardText; }
}
