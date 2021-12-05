package com.company;

import java.util.ArrayList;

public class Phase1 implements Phase{
    public int nbJoueurs = 4;
    public int nbThemes = 10;
    public Joueur[] joueurs;
    public Themes themes;
    public Questions tabQuestion;

    @Override
    public Joueur[] selectJoueurs() {
        Joueur[] result = new Joueur[3];
        int scoreMin = joueurs[0].getScore();
        int indicePerdant = 0;
        //int[] scores = new int[4];
        for (int i =0; i<nbJoueurs; i++){
            //scores[i] = joueurs[i].getScore();
            if (joueurs[i].getScore() < scoreMin){
                indicePerdant = i;
            }
        }
        joueurs[indicePerdant].setEtat("éliminé");
        for (Joueur i : joueurs){
            int j = 0;
            if (i.getEtat() == "sélectionné"){
                i.setEtat("gagnant");
                result[j] = i;
                j+=1;
            }
        }
        return result;
    }

    @Override
    public void playPhase() {
        String[] selectionThemes = themes.selectThemes(nbThemes);
        joueurs = Joueurs.selectJoueurs(nbJoueurs);
        Question[] selectionQuestions = new Question[nbThemes];
        for (Question i : selectionQuestions){
            for (String j : selectionThemes){
                int indiceListe = 0;
                ArrayList<Question> listeQuestions = tabQuestion.tableauQuestions[indiceListe];
                Question question = listeQuestions.get(0);
                if (question.getTheme()==j){

                }
            }

        }
    }
}
