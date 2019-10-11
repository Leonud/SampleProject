package HomeWork;

import java.util.*;

public class countInListSt {
    public static Map<String,Integer> countInList(List<String> list) {
        Map<String,Integer> map = new HashMap<>();
        for (String x : list) {
            if(map.containsKey(x)) {
                map.put(x,map.get(x) + 1);
            } else {
                map.put(x,1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<String>();
        Map<String, Integer> map = new HashMap<>();

        int y = 0;
        System.out.println("Количество элементов");
        y = sc.nextInt();
        for (int i = 0; i < y; i++) {
            String o = sc.next();
            strings.add(o);
        }
        map = countInList(strings);
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " " + value);
        }

    }
}

