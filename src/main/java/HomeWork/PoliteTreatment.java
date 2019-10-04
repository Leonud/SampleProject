package HomeWork;
import java.util.Scanner;
public class PoliteTreatment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insert row");
        String line = sc.nextLine();
        if (line.startsWith("Здравствуйте")){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
