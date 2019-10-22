package les4;
import java.util.Random;
import java.util.Scanner;
class progression {
    public static void main(String[] args) {
        Random rnd = new Random();
        rnd.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        if(l == 0){
            System.exit(0);
        }
        long  a = 0;
        int[] mas = new int[l];
        for (int i = 0; i < l; i++) {
            mas[i] = rnd.nextInt();
            if(mas[i] < 0){
                mas[i] = mas[i] * -1;
            }
            a = a + mas[i];
            System.out.println( mas[i]);
        }
        System.out.println("arithmetic mean");
        System.out.println(a/l);
    }
}
