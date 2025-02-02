public class Main {
    public static void main(String[] args) {

        IRequestHandler auth = new AuthHandler();
        IRequestHandler role = new RoleHandler();
        IRequestHandler limit = new LimitHandler();

        auth.setNext(role);
        role.setNext(limit);

        User user = new User("John DOE", true, EUserRole.ADMIN);
        System.out.println(user);

        BRequest a = new BRequest.Builder()
                .setType(ERequestType.CREATE)
                .setContent("")
                .setUser(user)
                .setMovie(FMovie.create("2001, L'Odysée de l'espace", "Science-fiction", "02:21"))
                .build();

        BRequest b = new BRequest.Builder()
                .setType(ERequestType.CREATE)
                .setContent("")
                .setUser(user)
                .setMovie(FMovie.create("Interstellar", "Science-fiction", "02:49"))
                .build();

        BRequest c = new BRequest.Builder()
                .setType(ERequestType.CREATE)
                .setContent("")
                .setUser(user)
                .setMovie(FMovie.create("Knight of Cups", "Drame", "01:58"))
                .build();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}