package Application;

public class VF extends Question{
    private boolean bonneReponse;
    public VF(){
        super();
    }

    public void input(String theme, String difficulte, String enonce,boolean bonneReponse){
        super.input(theme, difficulte, enonce);
        this.bonneReponse = bonneReponse;
    }

    public String toString(){
        return("Question "+numero+" : "+theme+", "+difficulte+", \n"+enonce+"\n Réponse : "+bonneReponse);
    }
}
