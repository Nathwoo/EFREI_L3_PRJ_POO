package com.company;

import java.util.ArrayList;

public class QCM {
    ArrayList<String> question;
    public QCM(){
        this.question = new ArrayList<String>();
    }

    public void input(String enonce,String reponse1,String reponse2,String reponse3,String bonne_reponse,String difficulte){
        question.add(enonce);
        question.add(reponse1);
        question.add(reponse2);
        question.add(reponse3);
        question.add(bonne_reponse);
        question.add(difficulte);
    }

    public String toString(){
        return(question.get(0)+"\n"+question.get(1)+"\n"+question.get(2)+"\n"+question.get(3));
    }

}
