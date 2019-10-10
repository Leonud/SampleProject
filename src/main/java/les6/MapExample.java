package les6;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        Faker faker = new Faker(new Locale("ru"));
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            map.put(faker.name().fullName(),rnd.nextInt(50));
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()){
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " " + value);
        }
    }
}
