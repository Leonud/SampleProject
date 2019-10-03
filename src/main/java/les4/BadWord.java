package les4;

public class BadWord {
    public static String prov(String line, String line1){
        String line2 = line.replaceAll(line1, "***");
            return line2;

    }
}
