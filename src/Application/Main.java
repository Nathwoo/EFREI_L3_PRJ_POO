package Application;

public class Main {

    public static void main(String[] args) {
        //  ENREGISTREMENT DES QUESTIONS
        QCM q1 = new QCM();
        q1.input("Histoire","facile", "Quel célèbre dictateur dirigea l'URSS du milieu des années 1920 à 1953 ?","Staline","Trotski","Lénine","Staline");
        //System.out.println(q1.toString());
        RC q2 = new RC();
        q2.input("Géographie","facile", "Dans quel pays peut-on trouver la Catalogne, l'Andalousie et la Castille ?","Espagne");
        //System.out.println(q2.toString());
        VF q3 = new VF();
        q3.input("Musique","facile","Bob Marley a écrit la chanson 'I shot the Sheriff'", true);
        //System.out.println(q3.toString());
        QCM q4 = new QCM();
        q4.input("Histoire","facile", "La première république française a été proclamée en :","1789","1792","1794","1792");
        QCM q5 = new QCM();
        q5.input("Sport","facile", "Quel pays a remporté la coupe du monde de football en 2014 ?","Argentine","Italie","Allemagne","Allemagne");
        QCM q6 = new QCM();
        q6.input("Littérature","facile", "Dans quelle ville se déroule la pièce 'Roméo et Juliette' ?","Florence","Venise","Vérone","Vérone");
        QCM q7 = new QCM();
        q7.input("Sport","facile", "Quel est le sport de prédilection de Rafael Nadal ?","Tennis","Basket","Golf","Tennis");
        QCM q8 = new QCM();
        q8.input("Littérature","facile", "Qui était le dieu de la guerre dans la mythologie grecque ?","Arès","Hermès","Hadès","Arès");
        QCM q9 = new QCM();
        q9.input("Géographie","facile", "Quelle est la capitale du Liban ?","Damas","Le Caire","Beyrouth","Beyrouth");
        QCM q10 = new QCM();
        q10.input("Musique","facile", "De quel pays les Beatles sont-ils originaires ?","Allemagne","Angleterre","Etats-Unis","Angleterre");
        QCM q11 = new QCM();
        q11.input("Sciences","facile", "Qu'est ce que le chlorure de sodium ?","Du sel","Du sucre","De la farine","Du sel");
        QCM q12 = new QCM();
        q12.input("Sciences","facile", "Quelle est, environ, la vitesse de la lumière ?","3000 km/s","33 333 km/s","300 000 km/s","300 000 km/s");
        QCM q13 = new QCM();
        q13.input("Cinéma","facile", "Quel acteur joue le héros du film 'Interstellar' ?","Brad Pitt","Matthew MacConaughey","Tom Cruise","Matthew MacConaughey");
        QCM q14 = new QCM();
        q14.input("Cinéma","facile", "En quelle année est sorti le film Titanic ?","1991","1997","2005","1997");

        //  CREATION DES THEMES
        String[] nomThemes = new String[]{"Histoire", "Géographie", "Musique", "Sport", "Sciences", "Littérature", "Cinéma" };
        Themes themes = new Themes(nomThemes);

        //  CREATION DE LA LISTE DES QUESTIONS
        Questions questions = new Questions(themes);
        questions.addQuestion(q1);
        questions.addQuestion(q2);
        questions.addQuestion(q3);
        questions.addQuestion(q4);
        questions.addQuestion(q5);
        questions.addQuestion(q6);
        questions.addQuestion(q7);
        questions.addQuestion(q8);
        questions.addQuestion(q9);
        questions.addQuestion(q10);
        questions.addQuestion(q11);
        questions.addQuestion(q12);
        questions.addQuestion(q13);
        questions.addQuestion(q14);

        //System.out.println(questions.toString());

        //  CREATION DES JOUEURS
        Joueur j1 = new Joueur();
        j1.input("A");
        //System.out.println(j1.toString());
        Joueur j2 = new Joueur();
        j2.input("B");
        //System.out.println(j2.toString());
        Joueur j3 = new Joueur();
        j3.input("C");
        Joueur j4 = new Joueur();
        j4.input("D");
        Joueur j5 = new Joueur();
        j5.input("E");
        Joueur j6 = new Joueur();
        j6.input("F");
        Joueur j7 = new Joueur();
        j7.input("G");
        Joueur j8 = new Joueur();
        j8.input("H");
        Joueur j9 = new Joueur();
        j9.input("I");
        Joueur j10 = new Joueur();
        j10.input("J");
        Joueur j11 = new Joueur();
        j11.input("K");
        Joueur j12 = new Joueur();
        j12.input("L");
        Joueur j13 = new Joueur();
        j13.input("M");
        Joueur j14 = new Joueur();
        j14.input("N");
        Joueur j15 = new Joueur();
        j15.input("O");
        Joueur j16 = new Joueur();
        j16.input("P");
        Joueur j17 = new Joueur();
        j17.input("Q");
        Joueur j18 = new Joueur();
        j18.input("R");
        Joueur j19 = new Joueur();
        j19.input("S");
        Joueur j20 = new Joueur();
        j20.input("T");



        //  CREATION DU TABLEAU DES JOUEURS
        Joueurs tabJoueurs = new Joueurs();
        /*
        for (int i=0; i<tabJoueurs.joueurs.length; i++){
            tabJoueurs.joueurs[i] = new Joueur();
            tabJoueurs.joueurs[i].input("j"+i);
        }
        */
        tabJoueurs.joueurs[0] = j1;
        tabJoueurs.joueurs[1] = j2;
        tabJoueurs.joueurs[2] = j3;
        tabJoueurs.joueurs[3] = j4;
        tabJoueurs.joueurs[4] = j5;
        tabJoueurs.joueurs[5] = j6;
        tabJoueurs.joueurs[6] = j7;
        tabJoueurs.joueurs[7] = j8;
        tabJoueurs.joueurs[8] = j9;
        tabJoueurs.joueurs[9] = j10;
        tabJoueurs.joueurs[10] = j11;
        tabJoueurs.joueurs[11] = j12;
        tabJoueurs.joueurs[12] = j13;
        tabJoueurs.joueurs[13] = j14;
        tabJoueurs.joueurs[14] = j15;
        tabJoueurs.joueurs[15] = j16;
        tabJoueurs.joueurs[16] = j17;
        tabJoueurs.joueurs[17] = j18;
        tabJoueurs.joueurs[18] = j19;
        tabJoueurs.joueurs[19] = j20;

        //System.out.println(tabJoueurs.toString());

        // PHASE 1
        Phase1 phase1 = new Phase1();
        phase1.joueurs = tabJoueurs;
        phase1.themes = themes;
        phase1.tabQuestion = questions;
        Joueur[] joueursPhase1 = phase1.selectJoueurs(tabJoueurs.joueurs);
        phase1.playPhase(joueursPhase1);

        /*for (Joueur i : gagnantsPhase1){
            System.out.println(i.toString());
        }*/

        /*String[] test = themes.selectThemes(5);
        for (String i : test){
            System.out.println(i);
        }*/
        // PHASE 2
        Phase2 phase2 = new Phase2();
        Themes themesPhase2 = new Themes(nomThemes);
        Themes selectionthemesPhase2 = new Themes(themesPhase2.selectThemes(6));
        phase2.themes = selectionthemesPhase2;
        /*for (String i : selectionthemesPhase2.getNoms()){
            System.out.println(i);
        }

        for (Joueur i : joueursPhase2){
            System.out.println(i.toString());
        }*/
        Joueur[] joueursPhase2 = phase2.selectJoueurs(joueursPhase1);
        phase2.playPhase(joueursPhase2);

    }
}
