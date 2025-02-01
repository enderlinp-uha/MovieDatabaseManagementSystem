import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private Boolean auth;
    private ERole role;
    private List<User> users = new ArrayList<>();

    public User() {}

    public User(int id, String name, Boolean auth, ERole role) {
        this.id = id;
        this.name = name;
        this.auth = auth;
        this.role = role;
    }

    public void create(int id, String name, Boolean auth, ERole role) {
        users.add(new User(id, name, auth, role));
    }

    public boolean isAuth() {
        return auth;
    }

    public void show() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Override
    public String toString() {
        return "User {id=" + id + ", name=" + name + ", auth=" + auth + ", role=" + role + "}";
    }
}
