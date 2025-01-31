public class Users {
    private int id;
    private String name;
    private Boolean auth;
    private ERole role;

    public Users(int id, String name, Boolean auth, ERole role) {
        this.id = id;
        this.name = name;
        this.auth = auth;
        this.role = role;
    }
}
