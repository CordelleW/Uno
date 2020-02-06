package uno;

/**
 *
 * @author Cordelle Walden
 */
public class Uno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UnoDeck ch = new UnoDeck();
        ch.generateDeck();
        int count = 0;
        for(UCards c: ch.cards){
            if (c.getWild()== null){
            System.out.println(count+ ". "+c.getValue() + " of " + c.getColor());
            count++;
            }
            if (c.getValue()== null){
            System.out.println(count+ ". " + c.getWild());
            count++;
            }      
        }
       // System.out.println(ch.cards); show what happens when there is no toString()
	
    }

}
