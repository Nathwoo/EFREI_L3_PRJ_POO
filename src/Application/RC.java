package Application;

public class RC extends Question{
    private String bonneReponse;

    public RC(){
        super();
    }

    public void input(String theme, String difficulte, String enonce,String bonneReponse){
        super.input(theme, difficulte, enonce);
        this.bonneReponse = bonneReponse;
    }

    public String toString(){
        return("Question "+numero+" : "+theme+", "+difficulte+", \n"+enonce+"\n Réponse : "+bonneReponse);
    }

}
