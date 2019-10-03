package les2;
import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxnumber = 0;
        int maxnumber1 = 0;
        int maxnumber2 = 0;
        System.out.println("insert the number");
        maxnumber = sc.nextInt();

        System.out.println("insert the number");
        maxnumber1 = sc.nextInt();

        System.out.println("insert the number");
        maxnumber2 = sc.nextInt();

        if(maxnumber > maxnumber1 && maxnumber > maxnumber2) {
                System.out.println(maxnumber);
                System.exit(0);
        }

        if(maxnumber1 > maxnumber2 && maxnumber1 > maxnumber) {
            System.out.println(maxnumber1);
            System.exit(0);
        }

        if(maxnumber2 > maxnumber1 && maxnumber2 > maxnumber) {
            System.out.println(maxnumber2);
            System.exit(0);
        }
        }
    }

