package Application;

public interface Phase {
    int nbJoueurs = 0;
    int nbThemes = 0;

    Joueur[] selectJoueurs(Joueur[] joueurs);

    void playPhase(Joueur[] joueurs);

}
