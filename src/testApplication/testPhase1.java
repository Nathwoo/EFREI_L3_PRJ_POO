package testApplication;

import Application.*;

public class testPhase1 {
    public static void main(String[] args){
        //  ENREGISTREMENT DES QUESTIONS
        // Histoire
        QCM q1 = new QCM();
        q1.input("Histoire","facile", "Quel célèbre dictateur dirigea l'URSS du milieu des années 1920 à 1953 ?","Staline","Trotski","Lénine",1);
        //System.out.println(q1.toString());
        QCM q4 = new QCM();
        q4.input("Histoire","facile", "La première république française a été proclamée en :","1789","1792","1794",2);
        VF q22 = new VF();
        q22.input("Histoire", "facile","Le roi de France Pepin le Bref appartenait à la dynastie des Carolingiens.", true);
        RC q23 = new RC();
        q23.input("Histoire","facile","En quelle année est mort Louis XIV ?","1715");

        // Géographie
        RC q2 = new RC();
        q2.input("Géographie","facile", "Dans quel pays peut-on trouver la Catalogne, l'Andalousie et la Castille ?","Espagne");
        QCM q9 = new QCM();
        q9.input("Géographie","facile", "Quelle est la capitale du Liban ?","Damas","Le Caire","Beyrouth",3);
        VF q33 = new VF();
        q33.input("Géographie","facile","La France a une frontière avec l'Autriche.", false);
        VF q34 = new VF();
        q34.input("Géographie","facile","Le Rhône traverse la ville de Lyon.", true);

        // Musique
        VF q3 = new VF();
        q3.input("Musique","facile","Bob Marley a écrit la chanson 'I shot the Sheriff'", true);
        VF q70 = new VF();
        q70.input("Musique","facile","Mathieu Dutronc est le vrai nom de -M-.", false);
        QCM q10 = new QCM();
        q10.input("Musique","facile", "De quel pays les Beatles sont-ils originaires ?","Allemagne","Angleterre","Etats-Unis",2);
        QCM q35 = new QCM();
        q35.input("Musique","facile", "Quel chanteur s’est révélé sur Internet grâce à son tube Marly-Gomont ?","Mathieu Edward","Doc Gyneco","Kaminy",3);

        // Sport
        QCM q5 = new QCM();
        q5.input("Sport","facile", "Quel pays a remporté la coupe du monde de football en 2014 ?","Argentine","Italie","Allemagne",3);
        QCM q7 = new QCM();
        q7.input("Sport","facile", "Quel est le sport de prédilection de Rafael Nadal ?","Tennis","Basket","Golf",1);
        RC q44 = new RC();
        q44.input("Sport","facile","Avec quoi joue-t-on au bowling ?","Boule");
        RC q45 = new RC();
        q45.input("Sport","facile","Combien de fois, Alain Prost a-t-il été champion du monde de Formule 1 ?","4");

        // Littérature
        QCM q6 = new QCM();
        q6.input("Littérature","facile", "Dans quelle ville se déroule la pièce 'Roméo et Juliette' ?","Florence","Venise","Vérone",3);
        QCM q8 = new QCM();
        q8.input("Littérature","facile", "Qui était le dieu de la guerre dans la mythologie grecque ?","Arès","Hermès","Hadès",1);
        RC q50 = new RC();
        q50.input("Littérature","facile","À quel auteur doit-on « La Chartreuse de Parme » ?","Stendhal");
        QCM q51 = new QCM();
        q51.input("Littérature","facile", "Quel roman célèbre du XXème siècle commence par cette phrase : \"Aujourd’hui maman est morte.\" ?","\"La nausée\", de Jean-Paul Sartre","\"Cent ans de solitude\", de Garcia Marquez","\"L’étranger\", d’Albert Camus",3);

        // Sciences
        QCM q11 = new QCM();
        q11.input("Sciences","facile", "Qu'est ce que le chlorure de sodium ?","Du sel","Du sucre","De la farine",1);
        QCM q12 = new QCM();
        q12.input("Sciences","facile", "Quelle est, environ, la vitesse de la lumière ?","3000 km/s","33 333 km/s","300 000 km/s",3);
        RC q54 = new RC();
        q54.input("Sciences","facile","Comment appelle-t-on un nombre divisible que par 1 et par lui-même ?","Premier");
        RC q55 = new RC();
        q55.input("Sciences","facile","À quel type de triangle s'applique le théorème de Pythagore ?","Rectangle");

        // Cinéma
        QCM q13 = new QCM();
        q13.input("Cinéma","facile", "Quel acteur joue le héros du film 'Interstellar' ?","Brad Pitt","Matthew MacConaughey","Tom Cruise",2);
        QCM q14 = new QCM();
        q14.input("Cinéma","facile", "En quelle année est sorti le film Titanic ?","1991","1997","2005",2);
        VF q56 = new VF();
        q56.input("Cinéma","facile","Dans la série des X-Men, Ben Affleck incarne Wolverine.",false);
        VF q57 = new VF();
        q57.input("Cinéma","facile","Kristen Dunst incarne Mary Jane Watson dans la trilogie Spider-Man de Sam Raimi.",true);

        // Economie
        QCM q15 = new QCM();
        q15.input("Economie","facile","Qui a écrit 'Le Capital' en 1850 ?","Friedrich Engels","Karl Marx","François Guizot",2);
        QCM q16 = new QCM();
        q16.input("Economie","facile","Quel est le nom de l'indice boursier allemand ?","Dax","Cac","Tax",1);
        VF q17 = new VF();
        q17.input("Economie","facile","L'Alena est une alliance de libre-échange en Amérique du Nord.",true);
        RC q18 = new RC();
        q18.input("Economie", "facile", "Dans quelle ville se trouve le siège du FMI, Fonds Monétaire International ?","Washington");

        // Politique
        RC q36 = new RC();
        q36.input("Politique","facile", "Combien d'années dure un mandat présidentiel ?","5");
        VF q37 = new VF();
        q37.input("Politique","facile", "Jacques Chirac a instauré la fin du service militaire",true);
        RC q39 = new RC();
        q39.input("Politique","facile","Quel est le nom de l'ancêtre du PS ?","SFIO");
        QCM q61 = new QCM();
        q61.input("Politique","facile", "Où siège l'Assemblée nationale ?","Au Palais Bourbon","Au Palais Royal","Au Palais du Luxembourg",1);

        // Culture générale
        VF q63 = new VF();
        q63.input("Culture générale","facile","En France, on peut conduire un bus à partir de 21 ans.",true);
        VF q65 = new VF();
        q65.input("Culture générale","facile","Oussama Ben Laden a-t-il été tué par un commando américain en 2011.",true);
        RC q67 = new RC();
        q67.input("Culture générale","facile", "Quel est le terme français pour email ?","Courriel");
        QCM q69 = new QCM();
        q69.input("Culture générale","facile", "Qu'appelle-t-on le Paris-Brest ?","Une dépression météorologique","Un poisson de l'Atlantique","Une pâtisserie",3);


        //  CREATION DES THEMES
        String[] nomThemes = new String[]{"Histoire", "Géographie", "Musique", "Sport", "Sciences", "Littérature", "Cinéma", "Economie", "Politique", "Culture générale"};
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
        questions.addQuestion(q15);
        questions.addQuestion(q16);
        questions.addQuestion(q17);
        questions.addQuestion(q18);
        questions.addQuestion(q22);
        questions.addQuestion(q23);
        questions.addQuestion(q33);
        questions.addQuestion(q34);
        questions.addQuestion(q35);
        questions.addQuestion(q36);
        questions.addQuestion(q37);
        questions.addQuestion(q39);
        questions.addQuestion(q44);
        questions.addQuestion(q45);
        questions.addQuestion(q50);
        questions.addQuestion(q51);
        questions.addQuestion(q54);
        questions.addQuestion(q55);
        questions.addQuestion(q56);
        questions.addQuestion(q57);
        questions.addQuestion(q61);
        questions.addQuestion(q63);
        questions.addQuestion(q65);
        questions.addQuestion(q67);
        questions.addQuestion(q69);
        questions.addQuestion(q70);

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
        Joueurs tabJoueurs = new Joueurs(20);

        tabJoueurs.tableauJoueurs[0] = j1;
        tabJoueurs.tableauJoueurs[1] = j2;
        tabJoueurs.tableauJoueurs[2] = j3;
        tabJoueurs.tableauJoueurs[3] = j4;
        tabJoueurs.tableauJoueurs[4] = j5;
        tabJoueurs.tableauJoueurs[5] = j6;
        tabJoueurs.tableauJoueurs[6] = j7;
        tabJoueurs.tableauJoueurs[7] = j8;
        tabJoueurs.tableauJoueurs[8] = j9;
        tabJoueurs.tableauJoueurs[9] = j10;
        tabJoueurs.tableauJoueurs[10] = j11;
        tabJoueurs.tableauJoueurs[11] = j12;
        tabJoueurs.tableauJoueurs[12] = j13;
        tabJoueurs.tableauJoueurs[13] = j14;
        tabJoueurs.tableauJoueurs[14] = j15;
        tabJoueurs.tableauJoueurs[15] = j16;
        tabJoueurs.tableauJoueurs[16] = j17;
        tabJoueurs.tableauJoueurs[17] = j18;
        tabJoueurs.tableauJoueurs[18] = j19;
        tabJoueurs.tableauJoueurs[19] = j20;

        //System.out.println(tabJoueurs.toString());

        // PHASE 1
        Phase1 phase1 = new Phase1();
        phase1.joueurs = tabJoueurs;
        phase1.themes = themes;
        phase1.tabQuestion = questions;
        Joueurs joueursPhase1 = phase1.selectJoueurs(tabJoueurs);
        phase1.playPhase(joueursPhase1);
    }
}
