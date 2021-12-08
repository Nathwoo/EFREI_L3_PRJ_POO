package testApplication;

import Application.Themes;

public class testThemes {
    public static void main(String args[]){
        String[] nomThemes = new String[]{"Histoire", "Géographie", "Musique", "Sport", "Sciences", "Littérature", "Cinéma" };
        Themes themes = new Themes(nomThemes);
        System.out.println(themes.toString());

        themes.selectTheme();
        System.out.println(themes.toString());

        themes.selectThemes(3);
        System.out.println(themes.toString());

    }
}
