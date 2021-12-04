package com.company;

public class Joueurs {
    Joueur[] joueurs;

    public Joueurs(){
        joueurs = new Joueur[20];
        for (Joueur i : joueurs){
            i = new Joueur();
        }
    }

    public Joueur selectJoueur(){
        int indice = (int)Math.random()*21;
        return joueurs[indice];
    }

    public String toString(){
        String result = "Liste des joueurs :\n";
        for (Joueur i : joueurs){
            if (i==null){
                continue;
            }else{
                result += i.toString()+"\n";
            }
        }
        return result;
    }
}
