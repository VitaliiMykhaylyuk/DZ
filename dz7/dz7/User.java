import java.util.List;

public class User {
    private String login;
    private String pass;

    public User(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public static void findUsers(String login, String pass, List userList) {
        int x=0;

        for (int i = 0; i < userList.size(); i++) {
            User a = ( User ) userList.get(i);

            if (login != null) {
                if (!login.equalsIgnoreCase(a.login) || !pass.equals(a.pass)) {
                    x=1;
                } else if (login.equalsIgnoreCase(a.login) && pass.equals(a.pass)) {
                    System.out.println("User is find " + login + " " + pass);
                    x=0;
                    break;
                }
            }
        }
        if (x==1){  System.out.println("User is not find " + login + " " + pass);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
