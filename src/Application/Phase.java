package Application;

public interface Phase {
    int nbJoueurs = 0;
    int nbThemes = 0;

    Joueurs selectJoueurs(Joueurs joueurs);

    void playPhase(Joueurs joueurs);

}
