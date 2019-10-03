package les3;
import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insert Temp");
        float Temp = sc.nextFloat();

        if(Temp >= 36.5 && Temp <= 36.7) {
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
    }

