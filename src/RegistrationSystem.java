import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegistrationSystem {
    String fileName;
    List<User> users = new ArrayList<>();

    public RegistrationSystem() {

    }
    public RegistrationSystem(String fileName) {
        this.fileName = fileName;
    }

    public User login(String nickname, String password){

        return null;
    }

    public boolean register(String nickname, String password){
        for(int i=0; i<users.size(); i++){
            if(users.get(i).getNickname().equals(nickname)){
                System.out.println("Пользователь с таким именем уже существует.");
                return false;
            }
            if(users.get(i).getPassword().equals(password)){
                System.out.println("Пароль слишком легко угадать. Придумайте другой пароль.");
                return false;
            }
        }
//        public User(String nickname, String password) {
//            this.nickname = nickname;
//            this.password = password;
//            this.registrationDate = new Date();
//        }

        users.add(new User(nickname,password));
        return true;
    }
    
    public void saveData(){

    }
}
