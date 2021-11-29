package com.company;

import java.util.ArrayList;

public class Themes {
    ArrayList<String> themes;

    public Themes(ArrayList<String> themes){
        this.themes = themes;
    }

    public int selectTheme(){
        int max = themes.size();
        return((int)Math.random()*(max+1));
    }

    public int[] selectFiveThemes(){
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
    }
}
