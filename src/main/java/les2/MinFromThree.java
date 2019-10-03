package les2;
import java.util.Scanner;

public class MinFromThree {
    public static int MinFromThree1(int a, int b, int c) {
        int max = 0;
        if (a < b && a < c) {
            max = a;
        }

        if (b < c && b < a) {
            max = b;
        }

        if (c < b && c < a) {
            max = c;
        }
        return (max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("insert the number");
        int maxnumber = sc.nextInt();

        System.out.println("insert the number");
        int maxnumber1 = sc.nextInt();

        System.out.println("insert the number");
        int maxnumber2 = sc.nextInt();

        System.out.println(MinFromThree1(maxnumber, maxnumber1, maxnumber2));
    }
}

