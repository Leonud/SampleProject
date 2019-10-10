package les6;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class ChuckNoris {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();



        Faker faker = new Faker(new Locale("ru"));
        Set<String> strings = new HashSet<>(list);
        for (int i = 0; i < 20 ; i++) {
            strings.add(faker.dog().age());
        }
        for (String x : strings){
            System.out.println(x);
        }
    }
}
