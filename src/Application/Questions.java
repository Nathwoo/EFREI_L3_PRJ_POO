package Application;

import java.util.ArrayList;

public class Questions {
    Themes themes;
    ArrayList[] tableauQuestions;
    ArrayList[] indicateurs;

    public Questions(Themes themes){
        this.themes = themes;
        tableauQuestions = new ArrayList[themes.nbThemes];
        indicateurs = new ArrayList[themes.nbThemes];
        for (int i=0; i< themes.nbThemes; i++){
            tableauQuestions[i] = new ArrayList<Question>();
            indicateurs[i] = new ArrayList<String>();
        }
    }

    public void addQuestion(Question q){
        int i = 0;
        while (q.getTheme() != themes.getNoms()[i]){
            i+=1;
        }
        tableauQuestions[i].add(q);
        indicateurs[i].add("disponible");
    }

    public void deleteQuestion(String nomTheme, int indice){
        int i = 0;
        while (nomTheme != themes.getNoms()[i]){
            i+=1;
        }
        tableauQuestions[i].remove(indice);
        indicateurs[i].remove(indice);
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

    public Question selectQuestion(int indiceListe,String difficulte){
        ArrayList<Question> listeQuestions = tableauQuestions[indiceListe];
        ArrayList<Question> selection = new ArrayList();
        for (int i=0; i<listeQuestions.size(); i++){
            if (listeQuestions.get(i).getDifficulte().equals(difficulte) && indicateurs[indiceListe].get(i).equals("disponible")){
                selection.add(listeQuestions.get(i));
            }
        }
        int max = selection.size();
        int indiceQuestion = (int)(Math.random()*max);
        for (int i=0; i<listeQuestions.size(); i++){
            if (listeQuestions.get(i) == selection.get(indiceQuestion)){
                indicateurs[indiceListe].set(i,"indisponible");
            }
        }
        return selection.get(indiceQuestion);

    }

}
