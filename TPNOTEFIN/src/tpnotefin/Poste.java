package tpnotefin;

////////
/*
*
* @author: Armalet Einhorn 
*
*
 */
/////////
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Poste {

    public static void main(String[] args) {
        BureauImplemente b;
        int nb_usager;
        int nb_guichet;
        int nombre;
        Guichet g;
        GuichetPrioritaire gp;

        nb_usager = (int) (Math.random() * 100) + 200;
        nb_guichet = (int) (Math.random() * 4) + 1;
        System.out.println("nombre est " + nb_guichet);
        nombre = (int) (Math.random() * 5) + 10;
        g = new Guichet(nb_guichet);
        b = new BureauImplemente(nb_guichet);
        for (int i = 0; i < nb_guichet; i++) {
            b.ouvrirNouveauGuichet(nombre);

            for (int j = 0; j < nb_usager; j++) {
                
                b.ajouterUsager(j);

            }
            System.out.println("numero guichet" + i);
            b.premierUsager(g);

        }
        int numero_guichet;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre numero");
        numero_guichet = sc.nextInt();
        while ((numero_guichet > nb_guichet) || (numero_guichet < 1)) {
            System.out.println("Entre numero");
            numero_guichet = sc.nextInt();
        }

        gp = new GuichetPrioritaire(nombre, numero_guichet);
        gp.toString();

    }

}
