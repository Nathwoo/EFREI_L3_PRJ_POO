package Application;

public abstract class Question {
    protected static int nbQuestions;
    protected int numero;
    protected String theme;
    protected String difficulte;
    protected String enonce;

    public Question() {
        nbQuestions += 1;
        numero = nbQuestions;
    }

    public void input(String theme, String difficulte, String enonce){
        this.theme = theme;
        this.difficulte = difficulte;
        this.enonce = enonce;
    }

    public String toString(){
        return("Question "+numero+" : "+theme+", "+difficulte+", "+enonce+" ");
    }

    public String getTheme() {
        return theme;
    }

    public String getDifficulte() {
        return difficulte;
    }

}
