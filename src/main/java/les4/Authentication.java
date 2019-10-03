package les4;
import java.util.Scanner;
public class Authentication {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter login and password");
            String myLog = sc.next();
            String myPass = sc.next();
            boolean result = logIn(myLog, myPass);
            System.out.println(result);
        }
        public static boolean logIn(String login, String password){
            String correctLogin = "admin";
            String correctPassword = "root";
            if(login.equals(correctLogin) && password.equals(correctPassword)){
                return true;
            }
            return false;
        }
    }
