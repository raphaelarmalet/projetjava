package tpnotefin;
////////
/*
*
* @author: Armalet Einhorn 
*
*
*/
/////////
public class BureauImplemente implements Bureau{

public int nb_guichet;
public int guichet[];
Guichet g;

        public BureauImplemente(int nb_guichet) {
                this.nb_guichet=nb_guichet;
                guichet=new int[nb_guichet];

                    }

         public Guichet  ouvrirNouveauGuichet (int capacité)
         {
            g=new Guichet(capacité);

             return g;
         }


    public void ajouterUsager(int numéro) {
        if(g.nb_usagers<g.capacité)
        {
           // for(int i=0;i<nb_guichet;i++)
           // {

                g.ajouterUsager(numéro);
           // }

        }
    else
        {
            System.out.println("Bureau saturé");
        }


    }


    public int premierUsager(Guichet g) {
       return g.premierUsager();
    }

}