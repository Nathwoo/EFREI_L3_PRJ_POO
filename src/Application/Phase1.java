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
            selectionJoueurs.joueurs[i] = selection[i];
        }
        return selectionJoueurs;
    }

    @Override
    public void playPhase(Joueurs selectionJoueurs) {
        System.out.println("PHASE 1\n");
        // Déroulement des tours
        for (int i=0; i<nbTours; i++){
            System.out.println("TOUR "+(i+1)+"\n");
            int indiceTheme = themes.selectTheme();
            System.out.println("Thème : "+themes.getNoms()[indiceTheme]+"\n");
            System.out.println("Questions :\n");
            for (Joueur j : selectionJoueurs.joueurs){
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
                    boolean b = j.answerQCM((QCM) Q);
                    if (b){
                        j.updateScore(2);
                    }
                }
                if (Q instanceof RC){
                    //System.out.print("Q");
                    boolean b = j.answerQCM((QCM) Q);
                    if (b){
                        j.updateScore(2);
                    }
                }
            }
        }
        // Recherche du perdant et changement d'état
        int scoreMin = selectionJoueurs.joueurs[0].getScore();
        int indicePerdant = 0;
        //int[] scores = new int[4];
        for (int i =0; i<nbJoueurs; i++){
            //scores[i] = joueurs[i].getScore();
            if (selectionJoueurs.joueurs[i].getScore() < scoreMin){
                indicePerdant = i;
            }
        }
        selectionJoueurs.joueurs[indicePerdant].updateState("éliminé");
        // Changement d'état des gagnants
        int j = 0;
        for (Joueur i : selectionJoueurs.joueurs){
            if (i.getEtat() == "sélectionné"){
                i.updateState("gagnant");
                j+=1;
            }
        }
        // Affichage des joueurs
        for (Joueur i : selectionJoueurs.joueurs){
            System.out.println(i.toString());
        }
        System.out.println("FIN PHASE 1\n");

    }
}
