package Application;
/*
public class Phase2 implements Phase{
    public int nbJoueurs=3;
    public String difficulte="facile";
    public Themes themes;

    @Override
    public Joueur[] selectJoueurs(Joueur[] joueursPhase1) {
        Joueur[] selectionJoueurs = new Joueur[3];
        int j = 0;
        for (Joueur i : joueursPhase1){
            if (i.getEtat() == "gagnant"){
                selectionJoueurs[j] = i;
                j+=1;
            }
        }
        return selectionJoueurs;
    }

    @Override
    public void playPhase(Joueur[] selectionJoueurs) {
        System.out.println("PHASE 2\n");
        //String[] selectionthemes = themes.selectThemes(nbJoueurs*2);
        // Choix des thèmes
        System.out.println("Thèmes disponibles :");
        for (String i : themes.getNoms()){
            System.out.println(i);
        }
        String[][] selectionthemes = new String[nbJoueurs][2];
        /*for (int i=0; i<nbJoueurs; i++){
            selectionthemes[i]= new String[]{"",""};
            selectionthemes[i][0]=themes.getNoms()[themes.selectTheme()];
            System.out.println(selectionthemes[i][0]);
        }
        for (String[] i : selectionthemes){

            i[0]=themes.getNoms()[themes.selectTheme()];

        }
        for (String[] i : selectionthemes){
            i[1]=themes.getNoms()[themes.selectTheme()];

        }
        System.out.println("\nChoix des thèmes");
            for (int i=0; i<nbJoueurs; i++){
                System.out.println(selectionJoueurs[i].getNom()+" : "+selectionthemes[i][0]+", "+selectionthemes[i][1]);
            }
    }
}*/
