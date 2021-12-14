package testApplication;

import Application.Joueur;
import Application.QCM;
import Application.RC;
import Application.VF;

public class testJoueur {
    public static void main(String[] args){
        Joueur j1 = new Joueur();
        j1.input("A");
        System.out.println(j1.toString());
        Joueur j2 = new Joueur();
        j2.input("B");
        System.out.println(j2.toString());

        /*
        j1.updateScore(2);
        System.out.println(j1.toString());
        j1.updateScore(0);
        System.out.println(j1.toString());

        j2.updateState("sélectionné");
        System.out.println(j2.toString());*/

        QCM q1 = new QCM();
        q1.input("Histoire","facile", "Quel célèbre dictateur dirigea l'URSS du milieu des années 1920 à 1953 ?","Staline","Trotski","Lénine",1);
        RC q2 = new RC();
        q2.input("Géographie","facile", "Dans quel pays peut-on trouver la Catalogne, l'Andalousie et la Castille ?","Espagne");
        VF q3 = new VF();
        q3.input("Musique","facile","Bob Marley a écrit la chanson 'I shot the Sheriff'", true);

        j1.answerQCM(q1);
        j1.answerRC(q2);
        j1.answerVF(q3);
        System.out.println(j1.toString());
    }
}
