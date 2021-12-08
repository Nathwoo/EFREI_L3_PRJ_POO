package testApplication;

import Application.*;

public class testQuestions {
    public static void main(String[] args){
        QCM q1 = new QCM();
        q1.input("Histoire","facile", "Quel célèbre dictateur dirigea l'URSS du milieu des années 1920 à 1953 ?","Staline","Trotski","Lénine","Staline");

        RC q2 = new RC();
        q2.input("Géographie","facile", "Dans quel pays peut-on trouver la Catalogne, l'Andalousie et la Castille ?","Espagne");

        VF q3 = new VF();
        q3.input("Musique","facile","Bob Marley a écrit la chanson 'I shot the Sheriff'", true);

        QCM q4 = new QCM();
        q4.input("Histoire","facile", "La première république française a été proclamée en :","1789","1792","1794","1792");

        String[] nomThemes = new String[]{"Histoire", "Géographie", "Musique"};
        Themes themes = new Themes(nomThemes);

        Questions questions = new Questions(themes);
        questions.addQuestion(q1);
        questions.addQuestion(q2);
        questions.addQuestion(q3);
        questions.addQuestion(q4);
        System.out.println(questions.toString());

        int theme = themes.selectTheme();
        Question q5 = questions.selectQuestion(theme, "facile");
        System.out.println(q5.toString());

        questions.deleteQuestion("Musique", 0);
        System.out.println(questions.toString());

    }
}
