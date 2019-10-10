package les6;
import java.util.ArrayList;
import com.github.javafaker.Faker;
import java.util.Locale;
public class ArrayListExample {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<String>();
            list.add("asd");
            list.add("Ya");
            list.remove("asd");

            ArrayList<String> list1 = new ArrayList<String>();
            list1.add("Ya");

            list.removeAll(list1);
            list.addAll(list1);
            for (int i = 0; i < list.size() ; i++) {
                System.out.println(list.get(i));
            }
    }
}
