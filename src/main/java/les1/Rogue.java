package les1;
import java.util.Scanner;
public class Rogue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coin1 = 0;
        int maxCoin = 0;
        int coin = 0;
        while(true) {
            System.out.println("coin"); // цена кукурузы
            coin = sc.nextInt();
            coin1 = coin1 + coin;
            if(coin>maxCoin) {
                maxCoin = coin;
            }
            if(coin == 0) {
                break;
            }
        }
        System.out.print("coin");
        System.out.println(coin1);
        System.out.print("Max coin");
        System.out.println(maxCoin);
    }
}
