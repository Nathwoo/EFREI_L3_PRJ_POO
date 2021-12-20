package Application;

import java.util.Scanner;

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

    public String getNom() {
        return nom;
    }

    public int getNumero(){
        return numero;
    }

    public boolean answerQCM(QCM q){
        System.out.println("Joueur "+numero);
        System.out.println(q.toString());
        Scanner scan = new Scanner(System.in);
        int rep = scan.nextInt();
        if (rep == q.getBonneReponse()){
            System.out.println("Bonne réponse !\n");
            return true;
        }
        System.out.println("Mauvaise réponse\n");
        return false;
    }

    public boolean answerVF(VF q){
        System.out.println("Joueur "+numero);
        System.out.println(q.toString());
        Scanner scan = new Scanner(System.in);
        String rep = scan.next();
        if ((rep.equalsIgnoreCase("V") && q.getBonneReponse()==true) || (rep.equalsIgnoreCase("F") && q.getBonneReponse()==false)){
            System.out.println("Bonne réponse !\n");
            return true;
        }
        System.out.println("Mauvaise réponse\n");
        return false;
    }

    public boolean answerRC(RC q){
        System.out.println("Joueur "+numero);
        System.out.println(q.toString());
        Scanner scan = new Scanner(System.in);
        String rep = scan.next();
        if (rep.equalsIgnoreCase(q.getBonneReponse())){
            System.out.println("Bonne réponse !\n");
            return true;
        }
        System.out.println("Mauvaise réponse\n");
        return false;
    }

}

