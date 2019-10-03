package les3;
import java.util.Scanner;
public class string_new {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insert line");
        String line = sc.next();
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '!') {
                count++;
            }
        }
        System.out.println(count);
        }
    }