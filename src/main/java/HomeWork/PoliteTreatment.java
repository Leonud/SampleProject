package HomeWork;
import java.util.Scanner;
public class PoliteTreatment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insert row");
        String line = sc.nextLine();
        String line1;
        line1 = line.replaceAll("Здравствуйте", "*");
        line1 = line.replaceAll("Здравствуй", "*");
        if (line1.charAt(0) == '*'){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
