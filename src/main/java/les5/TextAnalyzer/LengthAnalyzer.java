package les5.TextAnalyzer;

public class LengthAnalyzer implements  Analyzer {
    private  int maxLenght;

   public LengthAnalyzer(int maxLenght){
       this.maxLenght = maxLenght;
   }

    public boolean analyzer(String text) {
        if(text.length() > maxLenght){
            return  false;
        }
        return true;
    }
}
