package Application;

public class Joueurs {
    public Joueur[] joueurs;
    public int nbJoueurs;

    public Joueurs(int nbJoueurs){
        this.nbJoueurs = nbJoueurs;
        joueurs = new Joueur[nbJoueurs];
        for (Joueur i : joueurs){
            i = new Joueur();
        }
    }

    public Joueur selectJoueur(){
        int indice = (int)(Math.random()*nbJoueurs);
        while (joueurs[indice].getEtat() != "en attente") {
            indice +=1;
        }
        joueurs[indice].setEtat("sélectionné");
        return joueurs[indice];
    }

    public Joueur[] selectJoueurs(int nbJoueurs){
        Joueur[] result = new Joueur[nbJoueurs];
        for (int i=0; i<nbJoueurs; i++){
            result[i] = selectJoueur();
        }
        return result;
    }

    public String toString(){
        String result = "Liste des joueurs :\n";
        for (Joueur i : joueurs){
            if (i==null){
                continue;
            }else{
                result += i.toString()+"\n";
            }
        }
        return result;
    }
}
