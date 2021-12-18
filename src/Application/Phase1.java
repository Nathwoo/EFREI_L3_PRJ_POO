package Application;

public class Phase1 implements Phase{
    public int nbJoueurs = 4;
    public int nbTours = 4;
    public String difficulte = "facile";
    public Joueurs joueurs;
    public Themes themes;
    public Questions tabQuestion;

    @Override
    public Joueurs selectJoueurs(Joueurs j) {
        Joueur[] selection = joueurs.selectJoueurs(nbJoueurs);
        Joueurs selectionJoueurs = new Joueurs(selection.length);
        for (int i=0; i<nbJoueurs; i++){
            selectionJoueurs.tableauJoueurs[i] = selection[i];
        }
        return selectionJoueurs;
    }

    @Override
    public void playPhase(Joueurs selectionJoueurs) {
        System.out.println("PHASE 1\n");
        //Affichage des joueurs sélectionnés
        System.out.println("Joueurs sélectionnés :\n");
        for (Joueur i : selectionJoueurs.tableauJoueurs){
            System.out.println(i.toString());
        }
        // Déroulement des tours
        for (int i=0; i<nbTours; i++){
            System.out.println("TOUR "+(i+1)+"\n");
            int indiceTheme = themes.selectTheme();
            System.out.println("Thème : "+themes.getNoms()[indiceTheme]+"\n");
            System.out.println("Questions :\n");
            for (Joueur j : selectionJoueurs.tableauJoueurs){
                Question Q = tabQuestion.selectQuestion(indiceTheme, difficulte);
                if (Q instanceof QCM){
                    //System.out.print("Q");
                    boolean b = j.answerQCM((QCM) Q);
                    if (b){
                        j.updateScore(2);
                    }
                }
                if (Q instanceof VF){
                    //System.out.print("Q");
                    boolean b = j.answerVF((VF) Q);
                    if (b){
                        j.updateScore(2);
                    }
                }
                if (Q instanceof RC){
                    //System.out.print("Q");
                    boolean b = j.answerRC((RC) Q);
                    if (b){
                        j.updateScore(2);
                    }
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
        System.out.println("Résultats phase 1 :\n");
        for (Joueur i : selectionJoueurs.tableauJoueurs){
            System.out.println(i.toString());
        }
        System.out.println("FIN PHASE 1\n");

    }
}
