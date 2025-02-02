public class User {
    private int     id = 0;
    private String  name;
    private Boolean auth;
    private EUserRole role;

    public User(String name, Boolean auth, EUserRole role) {
        this.id   = ++id;
        this.name = name;
        this.auth = auth;
        this.role = role;
    }

    public boolean isAuth() {
        return auth;
    }

    public boolean isAdmin() {
        return role == EUserRole.ADMIN;
    }

    @Override
    public String toString() {
        return "User {id=" + id + ", name=" + name + ", auth=" + auth + ", role=" + role + "}";
    }
}
