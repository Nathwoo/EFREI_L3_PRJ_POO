package Application;

public class Phase2 implements Phase{
    public int nbJoueurs=3;
    public String difficulte="moyen";
    public Themes themes;
    public Questions tabQuestion;

    @Override
    public Joueurs selectJoueurs(Joueurs joueursPhase1) {
        Joueurs selectionJoueurs = new Joueurs(nbJoueurs);
        int j = 0;
        for (Joueur i : joueursPhase1.tableauJoueurs){
            if (i.getEtat() == "gagnant"){
                selectionJoueurs.tableauJoueurs[j] = i;
                i.updateState("sélectionné");
                j+=1;
            }
        }
        return selectionJoueurs;
    }

    @Override
    public void playPhase(Joueurs selectionJoueurs) {
        System.out.println("PHASE 2\n");
        //Affichage des joueurs sélectionnés
        System.out.println("Joueurs sélectionnés :\n");
        for (Joueur i : selectionJoueurs.tableauJoueurs){
            System.out.println(i.toString());
        }
        // Choix des thèmes
        System.out.println("\nChoix des thèmes :\n");
        Themes selectionthemes = new Themes(themes.selectThemes(6));

        String[][] choixThemes = selectionJoueurs.selectThemes(selectionthemes);

        for (int i=0; i<nbJoueurs; i++){
            System.out.println("Joueur "+selectionJoueurs.tableauJoueurs[i].getNumero()+" : "+choixThemes[i][0]+", "+choixThemes[i][1]);
        }
        //QUESTIONS TOUR 1
        for (int i=0; i<nbJoueurs; i++){
            int indiceTheme = 0;
            for (int j=0; j<themes.getNoms().length; j++){
                if (choixThemes[i][0] == themes.getNoms()[j]){
                    indiceTheme = j;
                }
            }
            Question Q = tabQuestion.selectQuestion(indiceTheme, difficulte);
            if (Q instanceof QCM){
                boolean b = selectionJoueurs.tableauJoueurs[i].answerQCM((QCM) Q);
                if (b){
                    selectionJoueurs.tableauJoueurs[i].updateScore(3);
                }
            }
            if (Q instanceof VF){
                boolean b = selectionJoueurs.tableauJoueurs[i].answerVF((VF) Q);
                if (b){
                    selectionJoueurs.tableauJoueurs[i].updateScore(3);
                }
            }
            if (Q instanceof RC){
                boolean b = selectionJoueurs.tableauJoueurs[i].answerRC((RC) Q);
                if (b){
                    selectionJoueurs.tableauJoueurs[i].updateScore(3);
                }
            }
        }

        //QUESTIONS TOUR 2
        for (int i=0; i<nbJoueurs; i++){
            int indiceTheme = 0;
            for (int j=0; j<themes.getNoms().length; j++){
                if (choixThemes[i][1] == themes.getNoms()[j]){
                    indiceTheme = j;
                }
            }
            Question Q = tabQuestion.selectQuestion(indiceTheme, difficulte);
            if (Q instanceof QCM){
                boolean b = selectionJoueurs.tableauJoueurs[i].answerQCM((QCM) Q);
                if (b){
                    selectionJoueurs.tableauJoueurs[i].updateScore(3);
                }
            }
            if (Q instanceof VF){
                boolean b = selectionJoueurs.tableauJoueurs[i].answerVF((VF) Q);
                if (b){
                    selectionJoueurs.tableauJoueurs[i].updateScore(3);
                }
            }
            if (Q instanceof RC){
                boolean b = selectionJoueurs.tableauJoueurs[i].answerRC((RC) Q);
                if (b){
                    selectionJoueurs.tableauJoueurs[i].updateScore(3);
                }
            }
        }

        // Recherche du perdant et changement d'état
        int scoreMin = selectionJoueurs.tableauJoueurs[0].getScore();
        int indicePerdant = 0;
        //int[] scores = new int[4];
        for (int i =0; i<nbJoueurs; i++){
            //scores[i] = tableauJoueurs[i].getScore();
            if (selectionJoueurs.tableauJoueurs[i].getScore() < scoreMin){
                indicePerdant = i;
            }
        }
        selectionJoueurs.tableauJoueurs[indicePerdant].updateState("éliminé");
        // Changement d'état des gagnants
        int j = 0;
        for (Joueur i : selectionJoueurs.tableauJoueurs){
            if (i.getEtat() == "sélectionné"){
                i.updateState("gagnant");
                j+=1;
            }
        }
        // Affichage des résultats
        System.out.println("Résultats phase 2 :\n");
        for (Joueur i : selectionJoueurs.tableauJoueurs){
            System.out.println(i.toString());
        }
        System.out.println("FIN PHASE 2\n");
    }
}
