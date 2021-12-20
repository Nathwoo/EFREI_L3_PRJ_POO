package Application;

public class Phase3 implements Phase{
    public int nbJoueurs=2;
    public int nbTours=3;
    public String difficulte="difficile";
    public Themes themes;
    public Questions tabQuestion;

    @Override
    public Joueurs selectJoueurs(Joueurs joueurs) {
        Joueurs selectionJoueurs = new Joueurs(nbJoueurs);
        int j = 0;
        for (Joueur i : joueurs.tableauJoueurs){
            if (i.getEtat() == "gagnant"){
                selectionJoueurs.tableauJoueurs[j] = i;
                i.updateState("sélectionné");
                j+=1;
            }
        }
        return selectionJoueurs;
    }

    @Override
    public void playPhase(Joueurs joueurs) {
        System.out.println("PHASE 3\n");
        //AFFICHAGE DES JOUEURS SELECTIONNES
        System.out.println("Joueurs sélectionnés :\n");
        for (Joueur i : joueurs.tableauJoueurs){
            System.out.println(i.toString());
        }
        //DEROULEMENT DES TOURS
        for (int i=0; i<nbTours; i++){
            System.out.println("TOUR "+(i+1)+"\n");
            int indiceTheme = themes.selectTheme();
            System.out.println("Thème : "+themes.getNoms()[indiceTheme]+"\n");
            System.out.println("Questions :\n");
            for (Joueur j : joueurs.tableauJoueurs){
                Question Q = tabQuestion.selectQuestion(indiceTheme, difficulte);
                if (Q instanceof QCM){
                    boolean b = j.answerQCM((QCM) Q);
                    if (b){
                        j.updateScore(5);
                    }
                }
                if (Q instanceof VF){
                    boolean b = j.answerVF((VF) Q);
                    if (b){
                        j.updateScore(5);
                    }
                }
                if (Q instanceof RC){
                    boolean b = j.answerRC((RC) Q);
                    if (b){
                        j.updateScore(5);
                    }
                }
            }
        }
        // CHANGEMENT D'ETAT DES JOUEURS
        if (joueurs.tableauJoueurs[0].getScore() <= joueurs.tableauJoueurs[1].getScore()){
            joueurs.tableauJoueurs[0].updateState("éliminé");
            joueurs.tableauJoueurs[1].updateState("super gagnant");
        }else {
            joueurs.tableauJoueurs[1].updateState("éliminé");
            joueurs.tableauJoueurs[0].updateState("super gagnant");
        }

        // AFFICHAGE RESULTATS
        System.out.println("Résultats phase 3 :\n");
        for (Joueur i : joueurs.tableauJoueurs){
            System.out.println(i.toString());
        }
        System.out.println("FIN Phase 3\n");

        for (Joueur i : joueurs.tableauJoueurs){
            if (i.getEtat() == "super gagnant"){
                System.out.println("Le gagnant est le joueur "+i.getNumero()+" '"+i.getNom()+"'.");
            }
        }
        System.out.println("FIN DU JEU\n");
    }
}
