package tpnotefin;
////////
/*
*
* @author: Armalet Einhorn 
*
*
 */
/////////
public class GuichetPrioritaire extends Guichet {

    public int num_guichet;

    public GuichetPrioritaire(int capacité, int num_guichet) {
        super(capacité);
        this.num_guichet = num_guichet;
    }

    @Override
    public String toString() {
        String phrase;

        phrase = (" Le guichet prioritaire " + num_guichet + " peut recevoir au maximum " + capacité);

        System.out.println(phrase);

        return phrase;
    }
}
