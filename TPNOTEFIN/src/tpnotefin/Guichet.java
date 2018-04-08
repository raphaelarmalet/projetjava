package tpnotefin;
////////
/*
*
* @author: Armalet Einhorn 
*
*
 */
/////////
public class Guichet {

    private int usagers[]; // tableau (file d’attente du guichet) privé des numéros entiers d’usagers (*)
    protected int id; // indice du premier usager (le plus ancien dans le tableau)
    public int nb_usagers; // nombre d’usagers dans le tableau
    public int capacité; // capacité maximale d’usagers du tableau

    public Guichet(int capacité) {
        this.capacité = capacité;
        usagers = new int[capacité];
        id = 0;
        nb_usagers = 0;

    } // constructeur

    public boolean guichetVide() {

        if (nb_usagers == 0) { 
            return true;
        } else {
            return false;
        }
    } // retourne true si nombre d’usagers=0, sinon false

    public boolean guichetPlein() {
        if (nb_usagers == capacité) {
            return true;
        } else {
            return false;
        }
    } // retourne true si nombre d’usagers=capacité, sinon false

    public int premierUsager() {
        if (guichetVide() == false) {
            this.nb_usagers = nb_usagers - 1;
            int num = this.usagers[this.id];

            id = (id + 1) % capacité;

            return num;

        } else {
            return 0;
        }

    } // défile et retourne le numéro du premier usager du tableau

    public void ajouterUsager(int numéro) {

        if (guichetPlein() == false) {
            nb_usagers = nb_usagers + 1;
            usagers[(id + nb_usagers) % capacité] = numéro;

        } else {
            System.out.println("Guichet complet");
        }

    } // ajoute (enfile) un usager dans le tableau
}
