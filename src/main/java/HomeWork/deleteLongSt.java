package HomeWork;
import java.util.ArrayList;
import com.github.javafaker.Faker;
import java.util.Locale;
import java.util.Scanner;
public class deleteLongSt {
    public static void deleteLong( ArrayList<String> list, int n){
        System.out.println("Было");
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("Стало");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() > n){
                list.remove(i);
                i--;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<String>();
        Faker faker = new Faker(new Locale("ru"));
        String line = "";
        while (true){
            System.out.println("insert line");
            System.out.println("0-Exit 1-Faker 2-You");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if(n == 2){line = sc.next(); strings.add(line);} else if (n == 1) {
                strings.add(faker.chuckNorris().fact());
            }
        }
        int n= 0;
        System.out.println("N");
        n = sc.nextInt();
        deleteLong(strings,n);
    }
}
