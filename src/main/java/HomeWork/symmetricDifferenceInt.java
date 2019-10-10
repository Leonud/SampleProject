package HomeWork;
import java.util.*;
import java.util.Scanner;
import com.github.javafaker.Faker;

public class symmetricDifferenceInt {
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2){
        int list = 0;
        Set<Integer> set3 = new HashSet<>(list);
        Set<Integer> set4 = new HashSet<>(list);
        set3.addAll(set1);
        set3.removeAll(set2);
        set4.addAll(set2);
        set4.removeAll(set1);
        set3.addAll(set4);
        return set3;
    }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int list = 0;
         Set<Integer> integers = new HashSet<>(list);
         Set<Integer> integers2 = new HashSet<>(list);
         Set<Integer> symmetric = new HashSet<>(list);
         System.out.println("1 set");
         System.out.println("set length");
         int y = sc.nextInt();
         for (int i = 0; i < y; i++) {
             System.out.println("number");
             int o = sc.nextInt();
             integers.add(i);
         }
         System.out.println("2 set");
         for (int i = 0; i < y; i++) {
             System.out.println("number");
             int o = sc.nextInt();
             integers2.add(o);
         }
         symmetric = symmetricDifference(integers,integers2);
         for (Integer x : symmetric){
             System.out.println(x);
         }
    }
}
