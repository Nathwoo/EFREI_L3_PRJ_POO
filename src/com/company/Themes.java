package com.company;

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
        int max = noms.length;
        int indice = (int)(Math.random()*max);
        indicateurs[indice] = true;
        return(indice);
    }

    public String[] selectThemes(int nbThemes){
       String[] result = new String[nbThemes];
       for (int i =0; i<nbThemes; i++){
               while (result[i] == null){
                   int indiceTheme = selectTheme();
                   if (indicateurs[indiceTheme] == false){
                       result[i]=noms[indiceTheme];
                   }
               }
           }
       return result;
    }

    public String[] getNoms() {
        return noms;
    }

    /*public int[] selectFiveThemes(){
        String[] result = new String[5];
        for (int i=0; i<5; i++){
            int indicetheme = selectTheme();
            boolean nouveau = true;
            while (nouveau = true){
                for(int j=0; j<i; j++){
                    if (result[j] != themes.get(indicetheme)){
                        continue;
                    }
                    else{
                        nouveau = false;

                    }
                }
            }
        }
    }*/
}
