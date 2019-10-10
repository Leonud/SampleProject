package les5.TextAnalyzer;

import java.security.Key;

public class SpamAnalyzer extends  KeyWordAnalyzer {

    public SpamAnalyzer(String[] spamWords){
        keyWords = spamWords;
    }
}
