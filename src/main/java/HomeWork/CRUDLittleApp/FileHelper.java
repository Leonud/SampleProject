package HomeWork.CRUDLittleApp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FileHelper {
    public static Map<String,User> readFromFile(String path){
        Map<String,User> users = new HashMap<>();
        try {
            FileReader reader = new FileReader(path);
            Scanner sc = new Scanner(reader);
            while(sc.hasNext()) {
                String login = sc.next();
                String password = sc.next();
                String fullName = sc.next();
                int age = sc.nextInt();
                users.put(login,new User(login,password,fullName));
            }
            sc.close();
            return users;
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
        return users;
    }

    public static void saveToFile(String path, Map<String,User> users,boolean arg){
        try {
            FileWriter writer = new FileWriter(path,arg);
            for (Map.Entry<String,User> current : users.entrySet()) {
                User userToWrite = current.getValue();
                writer.write(userToWrite.toString());
                writer.write("\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
