package Application;

public class Themes {
    public final int nbThemes;
    private String[] noms;
    private boolean[] indicateurs;

    public Themes(String[] noms){
        this.noms = noms;
        nbThemes = noms.length;
        indicateurs = new boolean[nbThemes];
    }

    public int selectTheme(){
        int indice = (int)(Math.random()*nbThemes);
        while (indicateurs[indice] == true){

            indice += 1;
            if (indice == nbThemes){
                indice = 0;
            }
        }
        indicateurs[indice] = true;
        return(indice);
    }

    public String[] selectThemes(int nbThemes){
       String[] result = new String[nbThemes];
       for (int i =0; i<nbThemes; i++){
           int indiceTheme = selectTheme();
           result[i]=noms[indiceTheme];
           }
       return result;
    }

    public String[] getNoms() {
        return noms;
    }

    public String toString(){
        String result = "Liste des thèmes\n";
        for(int i=0; i<nbThemes; i++){
            result += noms[i]+" : "+indicateurs[i]+"\n";
        }
        return result;
    }
}
