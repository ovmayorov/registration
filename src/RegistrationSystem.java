import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegistrationSystem implements Serializable {
    private String fileName;
    private List<User> users = new ArrayList<>();





    public RegistrationSystem(String fileName) {
        this.fileName = fileName;
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))){
            List<User> users = (List<User>)objectInputStream.readObject();
            setUsers(users);
            //RegistrationSystem dbUsers = (RegistrationSystem)objectInputStream.readObject();
        }
        catch(IOException | ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "RegistrationSystem{" +
                "users=" + users +
                '}';
    }

    public User login(String nickname, String password){
        for(int i=0; i<users.size(); i++) {
            String localNickname = users.get(i).getNickname();
            String localPassword = users.get(i).getPassword();
            if (localNickname.equals(nickname) && localPassword.equals(password)) {
                return users.get(i);
            }
        }
        System.out.println("Пользователь с таким логином и паролем не найден. ");
        return null;
    }

    public boolean register(String nickname, String password){
        for(int i=0; i<users.size(); i++){
            String localNickname = users.get(i).getNickname();
            String localPassword = users.get(i).getPassword();
            if(localNickname.equals(nickname)){
                System.out.println("Пользователь с таким именем уже существует.");
                return false;
            }
            if(localPassword.equals(password)){
                System.out.println("Пароль слишком легко угадать. Придумайте другой пароль.");
                return false;
            }
        }

        users.add(new User(nickname,password));
        return true;
    }
    public void saveData(){
           try(ObjectOutputStream objectOutputStream  = new ObjectOutputStream(
                new FileOutputStream(this.fileName))){
               objectOutputStream.writeObject(this.users);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}
