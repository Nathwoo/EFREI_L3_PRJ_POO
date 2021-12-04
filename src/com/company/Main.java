package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //  ENREGISTREMENT DES QUESTIONS
        QCM q1 = new QCM();
        q1.input("Histoire","facile", "Quel célèbre dictateur dirigea l'URSS du milieu des années 1920 à 1953 ?","Staline","Trotski","Lénine","Staline");
        //System.out.println(q1.toString());
        RC q2 = new RC();
        q2.input("Géographie","facile", "Dans quel pays peut-on trouver la Catalogne, l'Andalousie et la Castille ?","Espagne");
        //System.out.println(q2.toString());
        VF q3 = new VF();
        q3.input("Musique","facile","Bob Marley a écrit la chanson 'I shot the Sheriff'", true);
        //System.out.println(q3.toString());
        //  CREATION DES THEMES
        String[] nomThemes = new String[]{"Histoire", "Géographie", "Musique", "Sport", "Science"};
        Themes themes = new Themes(nomThemes);
        //  CREATION DE LA LISTE DES QUESTIONS
        Questions questions = new Questions(themes);
        questions.addQuestion(q1);
        questions.addQuestion(q2);
        questions.addQuestion(q3);
        //System.out.println(questions.toString());
        //  CREATION DES JOUEURS
        Joueur j1 = new Joueur();
        j1.input("A");
        System.out.println(j1.toString());
        Joueur j2 = new Joueur();
        j2.input("B");
        System.out.println(j2.toString());
        //  CREATION DU TABLEAU DES JOUEURS
        Joueurs tabJoueurs = new Joueurs();
        tabJoueurs.joueurs[0] = j1;
        tabJoueurs.joueurs[1] = j2;
        System.out.println(tabJoueurs.toString());
    }
}
