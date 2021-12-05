package com.company;

public interface Phase {
    int nbJoueurs = 0;
    int nbThemes = 0;

    Joueur[] selectJoueurs();

    void playPhase();

}
