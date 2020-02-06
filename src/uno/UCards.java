package uno;

/**
 *
 * @author Cordelle Walden
 */
public class UCards {
    public enum Color {RED, GREEN,YELLOW ,BLUE};
    public enum Value{ZERO, ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,
    ACE2, TWO2, THREE2, FOUR2, FIVE2, SIX2, SEVEN2, EIGHT2, NINE2,
    DrawTwo, SKIP, REVERSE, DrawTwo2, SKIP2, REVERSE2};
    public enum Wild {WILD1, WILD2, WILD3, WILD4, DRAWFOUR, DRAWFOUR2, DRAWFOUR3, DRAWFOUR4};
    private Color color;
    private Value value;
    private Wild wild;
    
    public UCards(Color s, Value gVal)
    {
       color =s;
       value= gVal;
    }
    public UCards(Wild n){
        wild = n;
    }

    public Value getValue() {
            return this.value;
    }

    public Color getColor() {
            return this.color;
    }
    public Wild getWild() {
            return this.wild;
    }
}
