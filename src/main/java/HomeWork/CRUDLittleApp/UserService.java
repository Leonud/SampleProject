package HomeWork.CRUDLittleApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {
   private Map<String,User> users;
    private User adminUser = new User("admin","admin","Lenya");
    public UserService() {
        users = new HashMap<>();
        users.put("admin",adminUser);
    }
    //да
    public User getByLogin(String login){
        return users.get(login);
    }
    //да
    public boolean addUser(User user) {
        if(users.get(user.getLogin()) == null){
            users.put(user.getLogin(),user);
            return true;
        } else{
            return false;
        }
    }
    //да
    public boolean deleteByLogin(String login){
        if(users.containsKey(login)) {
            if(!(adminUser.getLogin().equals(login))) {
                users.remove(login);
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
    //да
    public boolean editUser(User user){
        if(adminUser.getLogin().equals(user.getLogin())) {
            return false;
        } else {
            for (Map.Entry<String, User> pair : users.entrySet()) {
                if(pair.getKey().equals(user.getLogin())) {
                    users.remove(user.getLogin());
                    users.put(user.getLogin(),user);
                    return true;
                }
            }
            return false;
        }
    }
    //да
    public List<User> getAllUsers(){
        return new ArrayList<>(users.values());
    }
    //да
    public boolean auth(String login, String password){
        if(users.containsKey(login)){
            if(users.get(login).getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}