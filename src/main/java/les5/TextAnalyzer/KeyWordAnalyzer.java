package les5.TextAnalyzer;

public class KeyWordAnalyzer implements Analyzer {
    protected String[] keyWords;

    public boolean analyzer(String text) {
        for (int i = 0; i < keyWords.length; i++) {
            if (text.contains(keyWords[i])) {
                return false;
            }
        }
        return true;
    }
}