import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    private String nickname;
    private String password;
    private Date registrationDate;

    public User(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
        this.registrationDate = new Date();
    }

    @Override
    public String toString() {
        return "User{" +
                "nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }

    public User(String nickname, String password, Date registrationDate) {
        this.nickname = nickname;
        this.password = password;
        this.registrationDate = registrationDate;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
