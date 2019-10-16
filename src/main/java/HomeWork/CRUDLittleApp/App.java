package HomeWork.CRUDLittleApp;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        UserService a = new UserService();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1:Найти по логину");//не bool
            System.out.println("2:добавить пользователя");
            System.out.println("3:Показать всех");//не bool
            System.out.println("4:удалить по логину");
            System.out.println("5:Изменить пользователя");
            System.out.println("6:Есть ли пользователь с этим логином и паролем");
            int command = sc.nextInt();
            switch (command){
                //Найти по логину
                case 1: { //не bool
                    System.out.println("Введите логин");
                    String login = sc.next();
                    System.out.println(a.getByLogin(login));
                    break;
                }
                //добавить пользователя
                case 2: {
                    System.out.println("Имя");
                    String fullName = sc.next();
                    System.out.println("Логин");
                    String login = sc.next();
                    System.out.println("Пароль");
                    String password = sc.next();
                    User b = new User(login,password,fullName);
                   if(a.addUser(b)){
                       System.out.println("Успешно");
                   } else {
                       System.out.println("не успешно попробуйте снова");
                   }
                    break;
                }
                //Показать всех
                case 3: { //не bool
                    System.out.println(a.getAllUsers());
                    break;
                }
                //удалить по логину
                case 4: {
                    System.out.println("Логин");
                    String login = sc.next();
                    if(a.deleteByLogin(login)){
                        System.out.println("Успешно");
                    } else {
                        System.out.println("не успешно попробуйте снова");
                    }
                    break;
                }
                case 5: {
                    System.out.println("новое имя");
                    String fullName = sc.next();
                    System.out.println("Логин по которому меняем");
                    String login = sc.next();
                    System.out.println("новый пароль");
                    String password = sc.next();
                    User b = new User(login,password,fullName);
                    if( a.editUser(b)){
                        System.out.println("Успешно");
                    } else {
                        System.out.println("не успешно попробуйте снова");
                    }
                    break;
                }
                case 6: {
                    System.out.println("Логин");
                    String login = sc.next();
                    System.out.println("Пароль");
                    String password = sc.next();
                    if(a.auth(login,password)){
                        System.out.println("Успешно");
                    } else {
                        System.out.println("не успешно попробуйте снова");
                    }
                }
            }
        }
    }
}
