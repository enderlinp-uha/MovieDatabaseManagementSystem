public class User {
    private String  name = "";
    private Boolean isLoggedIn = false;

    private EUserRole role;

    public User(String name, EUserRole role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public EUserRole getRole() {
        return role;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void signin() {
        isLoggedIn = true;
    }

    public void signout() {
        isLoggedIn = false;
    }

    public boolean isAdmin() {
        return role == EUserRole.ADMIN;
    }

    @Override
    public String toString() {
        return "User{"
                + "name=" + this.name
                + ", isLoggedIn=" + this.isLoggedIn
                + ", role=" + this.role
                + "}";
    }
}
