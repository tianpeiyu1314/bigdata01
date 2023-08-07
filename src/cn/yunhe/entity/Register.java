package cn.yunhe.entity;

public class Register {
    private String username;
    private String password;
    private String hobbies;

    public Register() {
    }

    public Register(String username, String password, String hobby) {
        this.username = username;
        this.password = password;
        this.hobbies = hobbies;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Register{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }
}
