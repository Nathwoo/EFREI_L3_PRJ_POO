package Application;

public class Main {

    public static void main(String[] args) {
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
        RC q24 = new RC();
        q24.input("Histoire","moyen","Qui a fondé l’Académie Française ?","Richelieu");
        RC q25 = new RC();
        q25.input("Histoire","difficile","Quelle bataille a été gagnée par Napoléon en 1806 ?","Iena");
        RC q26 = new RC();
        q26.input("Histoire","difficile","En quelle année eu lieu la révocation de l’Edit de Nantes ?","1685");

        // Géographie
        RC q2 = new RC();
        q2.input("Géographie","facile", "Dans quel pays peut-on trouver la Catalogne, l'Andalousie et la Castille ?","Espagne");
        QCM q9 = new QCM();
        q9.input("Géographie","facile", "Quelle est la capitale du Liban ?","Damas","Le Caire","Beyrouth",3);
        RC q27 = new RC();
        q27.input("Géographie","moyen","Dans quelle ville italienne se trouve la tour Pirelli ?","Milan");
        VF q28 = new VF();
        q28.input("Géographie","difficile","La ville de Tunis est surnommée la 'Fiancée de la Méditerranée'.", false);
        QCM q29 = new QCM();
        q29.input("Géographie","difficile", "Quel est le chef-lieu du département de l’Allier ?","Vichy","Montluçon","Moulins",3);


        // Musique
        VF q3 = new VF();
        q3.input("Musique","facile","Bob Marley a écrit la chanson 'I shot the Sheriff'", true);
        QCM q10 = new QCM();
        q10.input("Musique","facile", "De quel pays les Beatles sont-ils originaires ?","Allemagne","Angleterre","Etats-Unis",2);
        QCM q30 = new QCM();
        q30.input("Musique","moyen", "Quel est le titre du second album studio de Stromae, sortie en 2013 ?","Pourquoi pas moi","Racine carrée","Formidable",2);


        // Sport
        QCM q5 = new QCM();
        q5.input("Sport","facile", "Quel pays a remporté la coupe du monde de football en 2014 ?","Argentine","Italie","Allemagne",3);
        QCM q7 = new QCM();
        q7.input("Sport","facile", "Quel est le sport de prédilection de Rafael Nadal ?","Tennis","Basket","Golf",1);


        // Littérature
        QCM q6 = new QCM();
        q6.input("Littérature","facile", "Dans quelle ville se déroule la pièce 'Roméo et Juliette' ?","Florence","Venise","Vérone",3);
        QCM q8 = new QCM();
        q8.input("Littérature","facile", "Qui était le dieu de la guerre dans la mythologie grecque ?","Arès","Hermès","Hadès",1);

        // Sciences
        QCM q11 = new QCM();
        q11.input("Sciences","facile", "Qu'est ce que le chlorure de sodium ?","Du sel","Du sucre","De la farine",1);
        QCM q12 = new QCM();
        q12.input("Sciences","facile", "Quelle est, environ, la vitesse de la lumière ?","3000 km/s","33 333 km/s","300 000 km/s",3);
        RC q31 = new RC();
        q31.input("Sciences","moyen","Quelle est le nom de l'étoile la plus proche de notre Système Solaire?","Proxima du Centaure");
        QCM q31 = new QCM();
        q31.input("Sciences","difficile", "Combien d'os composent le corps humain ?","179","206","249",2);
        QCM q32 = new QCM();
        q32.input("Sciences","difficile", "Combien de temps met la lumière pour nous parvenir du Soleil ?","4 minutes","8 minutes","12 minutes",2);



        // Cinéma
        QCM q13 = new QCM();
        q13.input("Cinéma","facile", "Quel acteur joue le héros du film 'Interstellar' ?","Brad Pitt","Matthew MacConaughey","Tom Cruise",2);
        QCM q14 = new QCM();
        q14.input("Cinéma","facile", "En quelle année est sorti le film Titanic ?","1991","1997","2005",2);
        QCM q33 = new QCM();
        q33.input("Cinéma","moyen", "Lequel de ces film ont eu le plus gros succès du box-office mondial ?","Titanic","Avengers: Endgame","Avatar",3);
        RC q34 = new RC();
        q34.input("Cinéma","difficile","Combien y a-t-il de film James Bond ?","25");
        QCM q35 = new QCM();
        q35.input("Cinéma","difficile", "Lequel des ces acteurs français a-t-il tourné le plus de films ?","Louis de Funès","Jean-Paul Belmondo","Alain Delon",1);



        // Economie
        QCM q15 = new QCM();
        q15.input("Economie","facile","Qui a écrit 'Le Capital' en 1850 ?","Friedrich Engels","Karl Marx","François Guizot",2);
        QCM q16 = new QCM();
        q16.input("Economie","facile","Quel est le nom de l'indice boursier allemand ?","Dax","Cac","Tax",1);
        VF q17 = new VF();
        q17.input("Economie","facile","L'Alena est une alliance de libre-échange en Amérique du Nord.",true);
        RC q18 = new RC();
        q18.input("Economie", "facile", "Dans quelle ville se trouve le siège du FMI, Fonds Monétaire International ?","Washington");
        VF q19 = new VF();
        q19.input("Economie","moyen","Le bâtiment abritant la bourse de Paris est le Palais Brongniart.",true);
        QCM q20 = new QCM();
        q20.input("Economie","difficile"," Quel économiste est le chef de file de l'école de Chicago ?","Kenneth Arrow","Joseph E. Stiglitz","Milton Friedman",3);
        QCM q21 = new QCM();
        q21.input("Economie","difficile"," Quel économiste français reçu le prix Nobel d’économie en 1988 ?","Michel Aglietta","Maurice Allais","Frédéric Bastiat",2);

        // Politique
        RC q36 = new RC();
        q36.input("Politique","facile", "Combien d'années dure un mandat présidentiel ?","5");
        VF q37 = new VF();
        q37.input("Politique","facile", "Jacques Chirac a instauré la fin du service militaire",true);
        RC q38 = new RC();
        q38.input("Politique","moyen","Combien d'années, la Quatrième République, a-t-elle duré ?","12");
        VF q39 = new VF();
        q39.input("Politique","difficile","Le plus petit mandat présidentiel de France", false);
        QCM q40 = new QCM();
        q40.input("Politique","difficile", "Le plus petit mandat présidentiel de France a été de : ","2 mois","4 mois","6 mois",3);



        //  CREATION DES THEMES
        String[] nomThemes = new String[]{"Histoire", "Géographie", "Musique", "Sport", "Sciences", "Littérature", "Cinéma", "Economie"}; //, "Politique", "Cuisine"
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
        questions.addQuestion(q19);
        questions.addQuestion(q20);
        questions.addQuestion(q21);
        questions.addQuestion(q22);
        questions.addQuestion(q23);
        questions.addQuestion(q24);
        questions.addQuestion(q25);
        questions.addQuestion(q26);
        questions.addQuestion(q27);
        questions.addQuestion(q28);
        questions.addQuestion(q29);
        questions.addQuestion(q30);

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

        // PHASE 2
        Phase2 phase2 = new Phase2();
        Themes themesPhase2 = new Themes(nomThemes);
        phase2.tabQuestion = questions;
        phase2.themes = themesPhase2;
        Joueurs joueursPhase2 = phase2.selectJoueurs(joueursPhase1);
        phase2.playPhase(joueursPhase2);

        // PHASE 3
        Phase3 phase3 = new Phase3();
        Themes themesPhase3 = new Themes(nomThemes);
        phase3.tabQuestion = questions;
        phase3.themes = themesPhase3;
        Joueurs joueursPhase3 = phase3.selectJoueurs(joueursPhase2);
        phase3.playPhase(joueursPhase3);
    }
}
