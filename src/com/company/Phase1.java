package com.company;

import java.util.ArrayList;

public class Phase1 implements Phase{
    public int nbJoueurs = 4;
    public int nbTours = 4;
    public String difficulte = "facile";
    public Joueurs joueurs;
    public Themes themes;
    public Questions tabQuestion;

    @Override
    public Joueur[] selectJoueurs() {
        Joueur[] selectionJoueurs = joueurs.selectJoueurs(nbJoueurs);
        return selectionJoueurs;
    }

    @Override
    public Joueur[] playPhase(Joueur[] selectionJoueurs) {
        System.out.println("PHASE 1\n");
        Joueur[] result = new Joueur[3];

        for (int i=0; i<nbTours; i++){
            System.out.println("TOUR "+(i+1)+"\n");
            int indiceTheme = themes.selectTheme();
            System.out.println("Thème : "+themes.getNoms()[indiceTheme]+"\n");
            System.out.println("Questions :\n");
            for (int j=0; j<nbJoueurs; j++){
                Question Q = tabQuestion.selectQuestion(indiceTheme, difficulte);
                System.out.println(Q.toString()+"\n");
                if (Math.random()<0.5){
                    selectionJoueurs[j].updateScore(2);
                }
            }
        }
        int scoreMin = selectionJoueurs[0].getScore();
        int indicePerdant = 0;
        //int[] scores = new int[4];
        for (int i =0; i<nbJoueurs; i++){
            //scores[i] = joueurs[i].getScore();
            if (selectionJoueurs[i].getScore() < scoreMin){
                indicePerdant = i;
            }
        }
        selectionJoueurs[indicePerdant].setEtat("éliminé");
        for (Joueur i : selectionJoueurs){
            int j = 0;
            if (i.getEtat() == "sélectionné"){
                i.setEtat("gagnant");
                result[j] = i;
                j+=1;
            }
        }
        return result;

    }
}
