package les2;
import java.util.Scanner;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(double a){
        boolean two = true;
        while (true) {
            if (a<1) {
                two = false;
                break;
            }
            if(a == 2 || a == 1){
                two = true;
                break;
            }
            a = a / 2;
        }
        return (two);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insert the number");
        double maxnumber = sc.nextInt();
        System.out.println(isPowerOfTwo(maxnumber));
    }
}
