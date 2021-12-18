package Application;

public class Phase2 implements Phase{
    public int nbJoueurs=3;
    public String difficulte="facile";
    public Themes themes;
    public Questions tabQuestion;

    @Override
    public Joueurs selectJoueurs(Joueurs joueursPhase1) {
        Joueurs selectionJoueurs = new Joueurs(3);
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
            System.out.println(selectionJoueurs.tableauJoueurs[i].getNom()+" : "+choixThemes[i][0]+", "+choixThemes[i][1]);
        }
        //QUESTIONS
        for (String[] i : choixThemes){
            int indiceTheme = 0;
            for (int j=0; j<themes.getNoms().length; j++){
                if (i[0] == themes.getNoms()[j]){
                    indiceTheme = j;
                }
            }
            Question Q = tabQuestion.selectQuestion(indiceTheme, difficulte);

        }
    }
}
