package les1;
import java.util.Scanner;
public class New2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount_of_corn = 0; // кол-во кукурузы
        int surrender = 0; // сдача
        System.out.println("corn price"); // цена кукурузы
        int corn = sc.nextInt();
        System.out.println("your money"); // твои деньги
        int your_money = sc.nextInt();
        System.out.println("Number of people"); // кол-во людей
        int number_of_people = sc.nextInt();

        if (your_money/corn >= number_of_people)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        System.out.println("left");
        surrender = your_money/corn;
        surrender = surrender * corn;
        surrender = your_money - surrender;
        System.out.println(surrender);
    }
    }
