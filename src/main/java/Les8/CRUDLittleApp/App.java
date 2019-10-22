package Les8.CRUDLittleApp;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        UserService a = new UserService();
        Scanner sc = new Scanner(System.in);
        while (true){
            int command = sc.nextInt();
            switch (command){
                case 1: {
                    System.out.println("Кто?");
                    String login = sc.next();
                    System.out.println(a.getByLogin(login));
                    break;
                }
                case 2: {
                    String login = sc.next();
                    String password = sc.next();
                    String fullName = sc.nextLine();
                    User b = new User(login,password,fullName);
                    a.addUser(b);
                    break;
                }
            }
        }
    }
}
