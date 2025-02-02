public class Main {
    public static void main(String[] args) {

        IRequestHandler auth  = new AuthHandler();
        IRequestHandler role  = new RoleHandler();
        IRequestHandler movie = new MovieHandler();

        auth.setNext(role);
        role.setNext(movie);

        User user1 = new User("John DOE", true, EUserRole.ADMIN);

        BRequest req1 = new BRequest.Builder()
                .setType(ERequestType.CREATE)
                .setUser(user1)
                .setMovie(FMovie.create("2001, L'Odysée de l'espace", "Science-fiction", "02:21"))
                .build();

        RequestHandler handler1 = new RequestHandler(req1);
        auth.handleRequest(handler1);

        User user2 = new User("Jane DOE", true, EUserRole.ADMIN);

        BRequest req2 = new BRequest.Builder()
                .setType(ERequestType.CREATE)
                .setUser(user2)
                .setMovie(FMovie.create("2001, L'Odysée de l'espace", "Science-fiction", "02:21"))
                .build();

        RequestHandler handler2 = new RequestHandler(req2);
        auth.handleRequest(handler2);

        /*BRequest req3 = new BRequest.Builder()
                .setType(ERequestType.CREATE)
                .setUser(user)
                .setMovie(FMovie.create("Knight of Cups", "Drame", "01:58"))
                .build();*/
    }
}