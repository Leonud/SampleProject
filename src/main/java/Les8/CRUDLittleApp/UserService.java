package Les8.CRUDLittleApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {
   private Map<String,User> users;

    public UserService() {
        users = new HashMap<>();
        User adminUser = new User("admin","admin","Lenya");
        users.put("admin",adminUser);
    }

    public User getByLogin(String login){
        return users.get(login);
    }
    public boolean addUser(User user) {
        if(users.get(user.getLogin()) == null){
            users.put(user.getLogin(),user);
            return true;
        } else{
            return false;
        }
    }
    public boolean deleteByLogin(String login){
        if(users.containsKey(login)) {
            users.remove(login);
            return true;
        }
        return false;
    }
    public boolean editUser(User user){
        if(users.containsKey(user.getLogin())){
            users.put(user.getLogin(),user);
            return  true;
        } else {
            return false;
        }
    }
    public List<User> getAllUsers(){
        return new ArrayList<>(users.values());
    }
    public boolean auth(String login, String password){
        if(users.containsKey(login)){
            if(users.get(login).getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}