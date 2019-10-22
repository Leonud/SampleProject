package Les9;

import java.io.*;
import java.util.Scanner;

public class Fails {
    public static void main(String[] args) {
        int a = 0; int i = 0;
        try (FileReader reader = new FileReader("src\\main\\java\\resources\\test.txt")) {
            Scanner sc = new Scanner(reader);
            while (sc.hasNextInt()) {
                a = sc.nextInt() + a;
                i++;
            }
            System.out.println("Сумма:" + a);
            System.out.println("Cреднее арифметическое:" + a / i);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}