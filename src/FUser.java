public class FUser {
    public static User createUser(String name, EUserRole role) {
        return new User(name, role);
    }
}
