package pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
public class User implements Serializable {
    @Id
    @GeneratedValue
    Integer id;
    String userid;
    String password;
    String realname;
    String email;
    char admin;

    public User() {

    }

    public User(String userid, String password, String realname, String email, char admin) {
        this.userid = userid;
        this.password = password;
        this.realname = realname;
        this.email = email;
        this.admin = admin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getAdmin() {
        return admin;
    }

    public void setAdmin(char admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realname + '\'' +
                ", email='" + email + '\'' +
                ", admin=" + admin +
                '}';
    }
}
