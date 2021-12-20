package testApplication;

import Application.*;

public class testPhase3 {
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
        VF q33 = new VF();
        q33.input("Géographie","facile","La France a une frontière avec l'Autriche.", false);
        VF q34 = new VF();
        q34.input("Géographie","facile","Le Rhône traverse la ville de Lyon.", true);
        RC q27 = new RC();
        q27.input("Géographie","moyen","Dans quelle ville italienne se trouve la tour Pirelli ?","Milan");
        VF q28 = new VF();
        q28.input("Géographie","difficile","La ville de Tunis est surnommée la 'Fiancée de la Méditerranée'.", false);
        QCM q29 = new QCM();
        q29.input("Géographie","difficile", "Quel est le chef-lieu du département de l’Allier ?","Vichy","Montluçon","Moulins",3);


        // Musique
        VF q3 = new VF();
        q3.input("Musique","facile","Bob Marley a écrit la chanson 'I shot the Sheriff'", true);
        VF q70 = new VF();
        q70.input("Musique","facile","Mathieu Dutronc est le vrai nom de -M-.", false);
        QCM q10 = new QCM();
        q10.input("Musique","facile", "De quel pays les Beatles sont-ils originaires ?","Allemagne","Angleterre","Etats-Unis",2);
        QCM q35 = new QCM();
        q35.input("Musique","facile", "Quel chanteur s’est révélé sur Internet grâce à son tube Marly-Gomont ?","Mathieu Edward","Doc Gyneco","Kaminy",3);
        QCM q30 = new QCM();
        q30.input("Musique","moyen", "Quel est le titre du second album studio de Stromae, sortie en 2013 ?","Pourquoi pas moi","Racine carrée","Formidable",2);
        QCM q42 = new QCM();
        q42.input("Musique","difficile", "Dans son « Supplique », où Georges Brassens voulait-il être enterré ?","Pourquoi pas moi","Sur la plage de Sète","Au Bar des Copains d’abord",1);
        VF q43 = new VF();
        q43.input("Musique","difficile","Pierre Pelletier est le vrai nom d'Eddy Mitchell", true);

        // Sport
        QCM q5 = new QCM();
        q5.input("Sport","facile", "Quel pays a remporté la coupe du monde de football en 2014 ?","Argentine","Italie","Allemagne",3);
        QCM q7 = new QCM();
        q7.input("Sport","facile", "Quel est le sport de prédilection de Rafael Nadal ?","Tennis","Basket","Golf",1);
        RC q44 = new RC();
        q44.input("Sport","facile","Avec quoi joue-t-on au bowling ?","Boule");
        RC q45 = new RC();
        q45.input("Sport","facile","Combien de fois, Alain Prost a-t-il été champion du monde de Formule 1 ?","4");
        RC q46 = new RC();
        q46.input("Sport","moyen","Dans quelle ville se trouve le stade du Nou Camp ?","Barcelone");
        VF q47 = new VF();
        q47.input("Sport","difficile","Louison Bobet était un tennisman.",false);
        QCM q48 = new QCM();
        q48.input("Sport","difficile", "À quelle hauteur se trouve le filet de volley pour une compétition masculine ?","2,24 mètres","2,43 mètres","2,78 mètres",2);

        // Littérature
        QCM q6 = new QCM();
        q6.input("Littérature","facile", "Dans quelle ville se déroule la pièce 'Roméo et Juliette' ?","Florence","Venise","Vérone",3);
        QCM q8 = new QCM();
        q8.input("Littérature","facile", "Qui était le dieu de la guerre dans la mythologie grecque ?","Arès","Hermès","Hadès",1);
        RC q49 = new RC();
        q49.input("Littérature","moyen","Quel auteur a livré ses « Mémoires d’outre-tombe » ?","Chateaubriand");
        RC q50 = new RC();
        q50.input("Littérature","facile","À quel auteur doit-on « La Chartreuse de Parme » ?","Stendhal");
        QCM q51 = new QCM();
        q51.input("Littérature","facile", "Quel roman célèbre du XXème siècle commence par cette phrase : \"Aujourd’hui maman est morte.\" ?","\"La nausée\", de Jean-Paul Sartre","\"Cent ans de solitude\", de Garcia Marquez","\"L’étranger\", d’Albert Camus",3);
        VF q52 = new VF();
        q52.input("Littérature","difficile","Rimbaud est l’auteur du vers : \" les sanglots longs des violons de l’automne \" ",false);
        VF q53 = new VF();
        q53.input("Littérature","difficile","Dans \"1984\" de George Orwell, Winston Smith travaille au ministère de la vérité.",true);

        // Sciences
        QCM q11 = new QCM();
        q11.input("Sciences","facile", "Qu'est ce que le chlorure de sodium ?","Du sel","Du sucre","De la farine",1);
        QCM q12 = new QCM();
        q12.input("Sciences","facile", "Quelle est, environ, la vitesse de la lumière ?","3000 km/s","33 333 km/s","300 000 km/s",3);
        RC q54 = new RC();
        q54.input("Sciences","facile","Comment appelle-t-on un nombre divisible que par 1 et par lui-même ?","Premier");
        RC q55 = new RC();
        q55.input("Sciences","facile","À quel type de triangle s'applique le théorème de Pythagore ?","Rectangle");
        RC q31 = new RC();
        q31.input("Sciences","moyen","Quelle est le nom de l'étoile la plus proche de notre Système Solaire?","Proxima du Centaure");
        QCM q41 = new QCM();
        q41.input("Sciences","difficile", "Combien d'os composent le corps humain ?","179","206","249",2);
        QCM q32 = new QCM();
        q32.input("Sciences","difficile", "Combien de temps met la lumière pour nous parvenir du Soleil ?","4 minutes","8 minutes","12 minutes",2);

        // Cinéma
        QCM q13 = new QCM();
        q13.input("Cinéma","facile", "Quel acteur joue le héros du film 'Interstellar' ?","Brad Pitt","Matthew MacConaughey","Tom Cruise",2);
        QCM q14 = new QCM();
        q14.input("Cinéma","facile", "En quelle année est sorti le film Titanic ?","1991","1997","2005",2);
        VF q56 = new VF();
        q56.input("Cinéma","facile","Dans la série des X-Men, Ben Affleck incarne Wolverine.",false);
        VF q57 = new VF();
        q57.input("Cinéma","facile","Kristen Dunst incarne Mary Jane Watson dans la trilogie Spider-Man de Sam Raimi.",true);
        RC q58 = new RC();
        q58.input("Cinéma","moyen","Dans quel film entend-on cette réplique « J’adore l’odeur du napalm au petit matin » ?","Apocalypse Now");
        RC q59 = new RC();
        q59.input("Cinéma","difficile","Dans quel film retrouve-t-on les sœurs Lisbon ?","Virgin Suicide");
        RC q60 = new RC();
        q60.input("Cinéma","difficile","À quel réalisateur doit-on le film « Maps to the Stars » ?","David Cronenberg");

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
        q38.input("Politique","difficile","Combien d'années, la Quatrième République, a-t-elle duré ?","12");
        RC q39 = new RC();
        q39.input("Politique","facile","Quel est le nom de l'ancêtre du PS ?","SFIO");
        QCM q40 = new QCM();
        q40.input("Politique","difficile", "Le plus petit mandat présidentiel de France a été de : ","2 mois","4 mois","6 mois",3);
        QCM q61 = new QCM();
        q61.input("Politique","facile", "Où siège l'Assemblée nationale ?","Au Palais Bourbon","Au Palais Royal","Au Palais du Luxembourg",1);
        RC q62 = new RC();
        q62.input("Politique","moyen", "En quelle année, Jean-Marie Le Pen a-t-il créé le Front National ?","1972");

        // Culture générale
        VF q63 = new VF();
        q63.input("Culture générale","facile","En France, on peut conduire un bus à partir de 21 ans.",true);
        QCM q64 = new QCM();
        q64.input("Culture générale","moyen", "Quel arbre produit le liège ?","Le chêne","Le cèdre","L'eucalyptus",1);
        VF q65 = new VF();
        q65.input("Culture générale","facile","Oussama Ben Laden a-t-il été tué par un commando américain en 2011.",true);
        QCM q66 = new QCM();
        q66.input("Culture générale","difficile", "À quelle région viticole les sarments doivent-ils leur nom ?","La Bourgogne","Médoc","Le Beaujolais",2);
        RC q67 = new RC();
        q67.input("Culture générale","facile", "Quel est le terme français pour email ?","Courriel");
        RC q68 = new RC();
        q68.input("Culture générale","difficile", "Dans quel état américain, l’Ouragan Katrina a-t-il fait un ravage en 2005 ?","Louisiane");
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
        questions.addQuestion(q31);
        questions.addQuestion(q32);
        questions.addQuestion(q33);
        questions.addQuestion(q34);
        questions.addQuestion(q35);
        questions.addQuestion(q36);
        questions.addQuestion(q37);
        questions.addQuestion(q38);
        questions.addQuestion(q39);
        questions.addQuestion(q40);
        questions.addQuestion(q41);
        questions.addQuestion(q42);
        questions.addQuestion(q43);
        questions.addQuestion(q44);
        questions.addQuestion(q45);
        questions.addQuestion(q46);
        questions.addQuestion(q47);
        questions.addQuestion(q48);
        questions.addQuestion(q49);
        questions.addQuestion(q50);
        questions.addQuestion(q51);
        questions.addQuestion(q52);
        questions.addQuestion(q53);
        questions.addQuestion(q54);
        questions.addQuestion(q55);
        questions.addQuestion(q56);
        questions.addQuestion(q57);
        questions.addQuestion(q58);
        questions.addQuestion(q59);
        questions.addQuestion(q60);
        questions.addQuestion(q61);
        questions.addQuestion(q62);
        questions.addQuestion(q63);
        questions.addQuestion(q64);
        questions.addQuestion(q65);
        questions.addQuestion(q66);
        questions.addQuestion(q67);
        questions.addQuestion(q68);
        questions.addQuestion(q69);
        questions.addQuestion(q70);

        //System.out.println(questions.toString());

        //  CREATION DES JOUEURS
        Joueur j1 = new Joueur();
        j1.input("A");
        Joueur j2 = new Joueur();
        j2.input("B");
        Joueur j3 = new Joueur();
        j3.input("C");

        j1.updateState("gagnant");
        j2.updateState("éliminé");
        j3.updateState("gagnant");

        //  CREATION DU TABLEAU DES JOUEURS
        Joueurs tabJoueurs = new Joueurs(3);
        tabJoueurs.tableauJoueurs[0] = j1;
        tabJoueurs.tableauJoueurs[1] = j2;
        tabJoueurs.tableauJoueurs[2] = j3;


        // PHASE 3

        Phase3 phase3 = new Phase3();
        Themes themesPhase3 = new Themes(nomThemes);
        phase3.tabQuestion = questions;
        phase3.themes = themesPhase3;
        Joueurs joueursPhase3 = phase3.selectJoueurs(tabJoueurs);
        phase3.playPhase(joueursPhase3);
    }
}
