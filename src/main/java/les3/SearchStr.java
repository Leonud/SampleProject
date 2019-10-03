package les3;
import java.util.Scanner;
public class SearchStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insert line");
        String line = sc.nextLine();
        System.out.println("filthy language");
        String filthyLanguage = sc.next();

            System.out.println(line.contains(filthyLanguage));

    }
}
