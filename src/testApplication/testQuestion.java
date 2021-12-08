package testApplication;

import Application.QCM;
import Application.RC;
import Application.VF;


public class testQuestion {
    public static void main(String[] args){
        QCM q1 = new QCM();
        q1.input("Histoire","facile", "Quel célèbre dictateur dirigea l'URSS du milieu des années 1920 à 1953 ?","Staline","Trotski","Lénine","Staline");
        System.out.println(q1.toString()+"\n");
        RC q2 = new RC();
        q2.input("Géographie","facile", "Dans quel pays peut-on trouver la Catalogne, l'Andalousie et la Castille ?","Espagne");
        System.out.println(q2.toString()+"\n");
        VF q3 = new VF();
        q3.input("Musique","facile","Bob Marley a écrit la chanson 'I shot the Sheriff'", true);
        System.out.println(q3.toString()+"\n");
    }

}
