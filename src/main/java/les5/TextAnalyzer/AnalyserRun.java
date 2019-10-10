package les5.TextAnalyzer;

import java.util.Scanner;

public class AnalyserRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        int count = 0;
        text = sc.next();
        Analyzer[] analyzers = new  Analyzer[3];
        analyzers[0] = new LengthAnalyzer(200);
        analyzers[1] = new SpamAnalyzer(new String[]{"кредит","микрозайм"});
        analyzers[2] = new SwearAnalyser();
        for (int i = 0; i < analyzers.length; i++) {
            if(analyzers[i].analyzer(text) == true){
                count++;
            }
        }
        if(count == 3){
            System.out.println("Yes");
        }
    }
}
