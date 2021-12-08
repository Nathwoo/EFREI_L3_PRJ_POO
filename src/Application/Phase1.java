package Application;

public class Phase1 implements Phase{
    public int nbJoueurs = 4;
    public int nbTours = 4;
    public String difficulte = "facile";
    public Joueurs joueurs;
    public Themes themes;
    public Questions tabQuestion;

    @Override
    public Joueur[] selectJoueurs(Joueur[] j) {
        Joueur[] selectionJoueurs = joueurs.selectJoueurs(nbJoueurs);
        return selectionJoueurs;
    }

    @Override
    public void playPhase(Joueur[] selectionJoueurs) {
        System.out.println("PHASE 1\n");
        // Déroulement des tours
        for (int i=0; i<nbTours; i++){
            System.out.println("TOUR "+(i+1)+"\n");
            int indiceTheme = themes.selectTheme();
            System.out.println("Thème : "+themes.getNoms()[indiceTheme]+"\n");
            System.out.println("Questions :\n");
            for (int j=0; j<nbJoueurs; j++){
                Question Q = tabQuestion.selectQuestion(indiceTheme, difficulte);
                System.out.println(Q.toString()+"\n");
                if (Math.random()<0.5){
                    selectionJoueurs[j].updateScore(2);
                }
            }
        }
        // Recherche du perdant et changement d'état
        int scoreMin = selectionJoueurs[0].getScore();
        int indicePerdant = 0;
        //int[] scores = new int[4];
        for (int i =0; i<nbJoueurs; i++){
            //scores[i] = joueurs[i].getScore();
            if (selectionJoueurs[i].getScore() < scoreMin){
                indicePerdant = i;
            }
        }
        selectionJoueurs[indicePerdant].setEtat("éliminé");
        // Changement d'état des gagnants
        int j = 0;
        for (Joueur i : selectionJoueurs){
            if (i.getEtat() == "sélectionné"){
                i.setEtat("gagnant");
                j+=1;
            }
        }
        // Affichage des joueurs
        for (Joueur i : selectionJoueurs){
            System.out.println(i.toString());
        }
        System.out.println("FIN PHASE 1\n");

    }
}
