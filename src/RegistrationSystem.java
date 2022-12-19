import java.util.ArrayList;
import java.util.List;

public class RegistrationSystem {
    String fileName;
    List<User> users = new ArrayList<>();

    public RegistrationSystem(String fileName) {
        this.fileName = fileName;
    }

    public User login(String nickname, String password){

        return null;
    }

    public boolean register(String nickname, String password){
        for(int i=0; i<users.size(); i++){
            if(users.get(i).getNickname().equals(nickname)){
                System.out.println("ѕользователь с таким именем уже существует.");
                return false;
            }
        }
        users.add(new User(nickname,password));
        return true;
    }
    
    public void saveData(){

    }
}
