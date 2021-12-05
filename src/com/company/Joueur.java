package com.company;

public class Joueur {
    private static int nbJoueurs;
    private int numero;
    private String nom;
    private int score;
    private String etat;

    public Joueur(){
        numero = nbJoueurs*10 + 100;
        nbJoueurs += 1;
        etat = "en attente";
    }

    public void input(String nom){
        this.nom = nom;
    }

    public String toString(){
        return "Joueur "+numero+"\n"+"Nom : "+nom+"\n"+"Score : "+score+"\n"+"Etat : "+etat;
    }

    public void updateScore(int s){
        if (s==0){
            score = 0;
        }else {
            score += s;
        }
    }

    public void updateState(String s){
        etat = s;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getEtat() {
        return etat;
    }

    public int getScore() {
        return score;
    }
}

