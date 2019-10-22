package Les9;

import HomeWork.CRUDLittleApp.User;
import HomeWork.CRUDLittleApp.UserService;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserFromfile {
    public static void main(String[] args) {
        UserService a1 = new UserService();
        try (FileReader reader = new FileReader("src\\main\\java\\resources")) {
            Scanner sc = new Scanner(reader);
            while (sc.hasNext()) {
                String a = sc.next();
                String b1 = sc.next();
                String c = sc.next();
                User b = new User(a,b1,c);
                a1.addUser(b);
            }
            System.out.println(a1.getAllUsers());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
