package testApplication;

import Application.Joueur;

public class testJoueur {
    public static void main(String[] args){
        Joueur j1 = new Joueur();
        j1.input("A");
        System.out.println(j1.toString());
        Joueur j2 = new Joueur();
        j2.input("B");
        System.out.println(j2.toString());

        j1.updateScore(2);
        System.out.println(j1.toString());
        j1.updateScore(0);
        System.out.println(j1.toString());

        j2.updateState("sélectionné");
        System.out.println(j2.toString());
    }
}
