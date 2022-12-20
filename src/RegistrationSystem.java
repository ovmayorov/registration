import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegistrationSystem implements Serializable {
    private String fileName;
    private List<User> users = new ArrayList<>();

//    public RegistrationSystem() {
//
//    }

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

    public RegistrationSystem(String fileName) {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))){
            List<User> users = (List<User>)objectInputStream.readObject();
            setUsers(users);
            //RegistrationSystem dbUsers = (RegistrationSystem)objectInputStream.readObject();
        }
        catch(IOException | ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }



//        this.fileName = fileName;
    }

    public User login(String nickname, String password){

        return null;
    }

    public boolean register(String nickname, String password){
        for(int i=0; i<users.size(); i++){
            String localNickname = users.get(i).getNickname();
            String localPassword = users.get(i).getPassword();
            if(localNickname.equals(nickname)){
                System.out.println("������������ � ����� ������ ��� ����������.");
                return false;
            }
            if(localPassword.equals(password)){
                System.out.println("������ ������� ����� �������. ���������� ������ ������.");
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
    

}
