package Application;

import java.util.Scanner;

public class Joueurs {
    public Joueur[] tableauJoueurs;
    public int nbJoueurs;

    public Joueurs(int nbJoueurs){
        this.nbJoueurs = nbJoueurs;
        tableauJoueurs = new Joueur[nbJoueurs];
        for (Joueur i : tableauJoueurs){
            i = new Joueur();
        }
    }

    public Joueur selectJoueur(){
        int indice = (int)(Math.random()*nbJoueurs);
        while (tableauJoueurs[indice].getEtat() != "en attente") {
            indice +=1;
        }
        tableauJoueurs[indice].setEtat("sélectionné");
        return tableauJoueurs[indice];
    }

    public Joueur[] selectJoueurs(int nbJoueurs){
        Joueur[] result = new Joueur[nbJoueurs];
        for (int i=0; i<nbJoueurs; i++){
            result[i] = selectJoueur();
        }
        return result;
    }

    public String toString(){
        String result = "Liste des tableauJoueurs :\n";
        for (Joueur i : tableauJoueurs){
            if (i==null){
                continue;
            }else{
                result += i.toString()+"\n";
            }
        }
        return result;
    }

    //FONCTION DE CHOIX DES THEMES POUR CHAQUE JOUEURS
    public String[][] selectThemes(Themes selectionThemes){
        String[][] choixThemes = new String[nbJoueurs][2];
        Scanner scan = new Scanner(System.in);
        //CHOIX DU PREMIER THEME POUR CHAQUE JOUEUR
        System.out.println("Choix du premier thème\n");
        for (int i=0; i<nbJoueurs; i++){
            System.out.println("Thèmes disponibles :");
            for (int j =0; j<selectionThemes.nbThemes; j++){
                if (selectionThemes.indicateurs[j] == false) {
                    System.out.println("Thème "+j+" : "+selectionThemes.getNoms()[j]);
                }
            }
            System.out.println("Joueur "+tableauJoueurs[i].getNumero()+" (Saisir numéro du thème choisi) :");
            int rep = scan.nextInt();
            //EVACUATION DES REPONSES NON CONFORMES ET DES DOUBLONS
            if (rep<0 || rep>selectionThemes.nbThemes-1 || selectionThemes.indicateurs[rep] == true){
                if (rep >= 0 && rep <= selectionThemes.nbThemes - 1 && selectionThemes.indicateurs[rep] == true){
                    System.out.println("Thème déjà sélectionné, choisissez-en un autre :");
                    boolean next = false;
                    while (!next){
                        rep = scan.nextInt();
                        if (rep<0 || rep>selectionThemes.nbThemes-1){
                            System.out.println("Réponse non valide, recommencez :");
                            boolean next1 = false;
                            while (!next1){
                                rep = scan.nextInt();
                                if(rep>=0 && rep<=selectionThemes.nbThemes-1){
                                    next1 = true;
                                }
                            }
                        }
                        if(selectionThemes.indicateurs[rep] == false){
                            next = true;
                        }
                    }

                }else {
                    System.out.println("Réponse non valide, recommencez :");
                    boolean next = false;
                    while (!next) {
                        rep = scan.nextInt();
                        if (rep >= 0 && rep <= selectionThemes.nbThemes - 1 && selectionThemes.indicateurs[rep] == false) {
                            next = true;
                        }
                    }
                }
            }

            selectionThemes.indicateurs[rep] = true;
            choixThemes[i][0]=selectionThemes.getNoms()[rep];
        }
        //CHOIX DU DEUXIEME THEME POUR CHAQUE JOUEUR
        System.out.println("Choix du deuxième thème\n");
        for (int i=0; i<nbJoueurs; i++){
            System.out.println("Thèmes disponibles :");
            for (int j =0; j<selectionThemes.nbThemes; j++){
                if (selectionThemes.indicateurs[j] == false) {
                    System.out.println("Thème "+j+" : "+selectionThemes.getNoms()[j]);
                }
            }
            System.out.println("Joueur "+tableauJoueurs[i].getNumero()+" (Saisir numéro du thème choisi)");
            int rep = scan.nextInt();
            //EVACUATION DES REPONSES NON CONFORMES ET DES DOUBLONS
            if (rep<0 || rep>selectionThemes.nbThemes-1 || selectionThemes.indicateurs[rep] == true){
                if (rep >= 0 && rep <= selectionThemes.nbThemes - 1 && selectionThemes.indicateurs[rep] == true){
                    System.out.println("Thème déjà sélectionné, choisissez-en un autre :");
                    boolean next = false;
                    while (!next){
                        rep = scan.nextInt();
                        if (rep<0 || rep>selectionThemes.nbThemes-1){
                            System.out.println("Réponse non valide, recommencez :");
                            boolean next1 = false;
                            while (!next1){
                                rep = scan.nextInt();
                                if(rep>=0 && rep<=selectionThemes.nbThemes-1){
                                    next1 = true;
                                }
                            }
                        }
                        if(selectionThemes.indicateurs[rep] == false){
                            next = true;
                        }
                    }

                }else {
                    System.out.println("Réponse non valide, recommencez :");
                    boolean next = false;
                    while (!next) {
                        rep = scan.nextInt();
                        if (rep >= 0 && rep <= selectionThemes.nbThemes - 1 && selectionThemes.indicateurs[rep] == false) {
                            next = true;
                        }
                    }
                }
            }
            selectionThemes.indicateurs[rep] = true;
            choixThemes[i][1]=selectionThemes.getNoms()[rep];
        }
        return choixThemes;
    }
}
