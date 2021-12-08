package Application;

import java.util.ArrayList;

public class Questions {
    Themes themes;
    ArrayList[] tableauQuestions;

    public Questions(Themes themes){
        this.themes = themes;
        tableauQuestions = new ArrayList[themes.nbThemes];
        for (int i=0; i< themes.nbThemes; i++){
            tableauQuestions[i] = new ArrayList<Question>();
        }
    }

    public void addQuestion(Question q){
        int i = 0;
        while (q.getTheme() != themes.getNoms()[i]){
            i+=1;
        }
        tableauQuestions[i].add(q);
    }

    public void deleteQuestion(String nomTheme, int indice){
        int i = 0;
        while (nomTheme != themes.getNoms()[i]){
            i+=1;
        }
        tableauQuestions[i].remove(indice);
    }

    public String toString(){
        String result = "Liste des questions \n";
        for (int i=0; i< themes.nbThemes; i++){
            result += themes.getNoms()[i]+" : \n";
            ArrayList<Question> liste = tableauQuestions[i];
            for (int j=0; j< liste.size(); j++){
                result += liste.get(j).toString()+"\n";
            }
        }
        return result;
    }

    public Question selectQuestion(int indiceListe, String difficulte){
        ArrayList<Question> listeQuestions = tableauQuestions[indiceListe];
        ArrayList<Question> selection = new ArrayList();
        for (Question q : listeQuestions){
            if (q.getDifficulte() == difficulte){
                selection.add(q);
            }
        }
        int max = selection.size();
        int indice = (int)(Math.random()*max);
        return selection.get(indice);

    }

    /*public Question selectQuestion(String theme, String difficulte){
        int indiceListe = 0;
        for (int i=0; i<themes.nbThemes; i++){
            if (themes.getNoms()[i] == theme){
                indiceListe=i;
            }
        }
        ArrayList<Question> listeQuestions = tableauQuestions[indiceListe];
        ArrayList<Question> selection = null;
        for (Question q : listeQuestions){
            if (q.getDifficulte() == difficulte){
                selection.add(q);
            }
        }
        int max = selection.size();
        int indice = (int)Math.random()*(max+1);
        return selection.get(indice);

    }*/

}
