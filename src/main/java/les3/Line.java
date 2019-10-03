package les3;
import java.util.Scanner;
public class Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insert line");
        String line = sc.next();
        int count = 0;
        int i = line.length();
        i--;
        while(i!=-1) {
            System.out.print(line.charAt(i));
            i--;
        }

    }
}
