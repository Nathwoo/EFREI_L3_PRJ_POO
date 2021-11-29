package com.company;

import java.util.ArrayList;

public class VF {
    ArrayList<String> question;
    public VF(){
        this.question = new ArrayList<String>();
    }

    public void input(String enonce,String bonne_reponse,String difficulte){
        question.add(enonce);
        question.add(bonne_reponse);
        question.add(difficulte);
    }

    public String toString(){
        return(question.get(0)+"\n Vrai \n Faux \n");
    }
}
