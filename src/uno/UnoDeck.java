package uno;

/**
 *
 * @author Cordelle Walden
 */
public class UnoDeck {
    private int handSize = 108;
    public UCards[] cards = new UCards[handSize];
    
    public void generateDeck(){
        int countCards = 0;
        for(UCards.Color s: UCards.Color.values())
        {
            for(UCards.Value v: UCards.Value.values())
            {
                cards[countCards] = (new UCards(s,v));
                countCards++;
            }
        }
        for(UCards.Wild v: UCards.Wild.values())
            {
                cards[countCards] =  (new UCards(v));
                countCards++;
            }//end outter for
    }//end method
}
