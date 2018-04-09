/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;


/**
 *
 * @author segado
 */
public class ModeConsole {

    Scanner in = new Scanner(System.in); // lire au clavier

    @Override
    public String toString() {
        String s;

        s = in.next();
        return s;
    }

    /**
     * affiche le menu et retourne le choix
     *
     * @return choix
     */
    public char menu() {

        String choix;
        System.out.println("1 Connexion DATABASE");
         System.out.println("2 Connexion ECE");
        System.out.println("0 Quitter");

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre choix :");
        choix = sc.next();

        return choix.charAt(0);
    }



}
