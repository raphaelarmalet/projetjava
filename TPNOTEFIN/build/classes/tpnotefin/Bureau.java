package tpnotefin;
////////
/*
*
* @author: Armalet Einhorn 
*
*
 */
/////////
interface Bureau {

    public Guichet ouvrirNouveauGuichet(int capacité);

    public void ajouterUsager(int numéro);

    public int premierUsager(Guichet g);
}
