package com.company;

public class QCM extends Question{
    private String reponse1;
    private String reponse2;
    private String reponse3;
    private String bonneReponse;

    public QCM(){
        super();
    }

    public void input(String theme, String difficulte, String enonce, String reponse1, String reponse2, String reponse3, String bonneReponse){
        super.input(theme, difficulte, enonce);
        this.reponse1 = reponse1;
        this.reponse2 = reponse2;
        this.reponse3 = reponse3;
        this.bonneReponse = bonneReponse;
    }

    public String toString(){
        return("Question "+numero+" : "+theme+", "+difficulte+", \n"+enonce+"\n 1."+reponse1+"\n 2."+reponse2+"\n 3."+reponse3+"\n Réponse : "+bonneReponse);
    }

}
