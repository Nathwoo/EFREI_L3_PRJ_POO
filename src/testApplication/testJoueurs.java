package testApplication;

import Application.Joueur;
import Application.Joueurs;

public class testJoueurs {
    public static void main(String[] args){
        Joueur j1 = new Joueur();
        j1.input("A");
        Joueur j2 = new Joueur();
        j2.input("B");
        Joueur j3 = new Joueur();
        j3.input("C");
        Joueur j4 = new Joueur();
        j4.input("D");

        Joueurs tabJoueurs = new Joueurs(4);
        tabJoueurs.tableauJoueurs[0] = j1;
        tabJoueurs.tableauJoueurs[1] = j2;
        tabJoueurs.tableauJoueurs[2] = j3;
        tabJoueurs.tableauJoueurs[3] = j4;
        System.out.println(tabJoueurs.toString());

        tabJoueurs.selectJoueur();
        System.out.println(tabJoueurs.toString());


    }
}
