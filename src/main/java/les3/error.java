package les3;
import java.util.Scanner;
public class error {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ideal");
        float result = sc.nextFloat();
        System.out.println("error");
        float error = sc.nextFloat();
        float resultSk = -1;
        while(resultSk != 0) {
            System.out.println("reseult");
             resultSk = sc.nextFloat();
             if(resultSk >= result - error && resultSk  <= result + error) {
                 System.out.println("Yes");
             } else {
                 System.out.println("No");
             }
        }
    }
}
