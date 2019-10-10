package les5.TextAnalyzer;

public class SwearAnalyser extends  KeyWordAnalyzer implements  Analyzer{
    public SwearAnalyser(){
        keyWords = new String[]{"fuck","bitch","swag","mother"};
    }
}
