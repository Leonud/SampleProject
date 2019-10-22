package HomeWork;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class progression {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;
        int a = 0;
        int i = 1;
        boolean arif = true;
        boolean c = true;
        try {
            FileReader reader = new FileReader("src\\main\\java\\resources\\test.txt");
            Scanner sc = new Scanner(reader);

            while (sc.hasNextInt()) {
                if (c) {
                    number1 = sc.nextInt();
                }
                number2 = sc.nextInt();
                if (c) {
                    a = number2 - number1;
                    c = false;
                }
                if (number2 ==number1 + (a * i)){
                    arif = true;
                } else {
                    arif = false;
                    break;
                }
                i++;
            }
            if(arif) {
                System.out.println("алгебраическая прогрессия");
            }
            else {
                number1 = 0;
                number2 = 0;
                a = 0;
                i = 0;
                c = true;
                boolean geometr = true;
                while (sc.hasNextInt()) {
                    if (c) {
                        number1 = sc.nextInt();
                    }
                    number2 = sc.nextInt();
                    i++;
                    int a1 = 1;
                    if (c) {
                        a = number2 / number1;
                        c = false;
                    }
                    for (int j = 0; j < i; j++) {
                        a1 = a1 * a;
                    }
                    if (number2 == number1 * a1) {
                        geometr = true;
                    } else {
                        geometr = false;
                        break;
                    }
                }
                if (geometr) {
                    System.out.println("геометрическая прогрессия");
                } else {
                    System.out.println("никакая прогрессия");
                }
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
