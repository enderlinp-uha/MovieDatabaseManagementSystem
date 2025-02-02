public class User {
    private int id;
    private String name;
    private Boolean auth;
    private ERole role;

    public User(int id, String name, Boolean auth, ERole role) {
        this.id = id;
        this.name = name;
        this.auth = auth;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isAuth() {
        return auth;
    }

    public boolean isAdmin() {
        return role == ERole.ADMIN;
    }

    @Override
    public String toString() {
        return "User {id=" + id + ", name=" + name + ", auth=" + auth + ", role=" + role + "}";
    }
}
