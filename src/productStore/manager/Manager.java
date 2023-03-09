package productStore.manager;

public class Manager {
    private final String login = "Bayel";
    private final String password = "111";

    public Manager() {
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
