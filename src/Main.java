import java.util.*;

public class Main {
    public static void main(String[] args) {

        IRequestHandler auth  = new AuthHandler();
        IRequestHandler role  = new RoleHandler();
        IRequestHandler movie = new MovieHandler();

        auth.setNext(role);
        role.setNext(movie);

        User user1 = new User("John DOE", true, EUserRole.ADMIN);
        User user2 = new User("Jane DOE", true, EUserRole.ADMIN);
        User user3 = new User("Jack DOE", false, EUserRole.ADMIN);
        User user4 = new User("SpongeBob", true, EUserRole.USER);

        HashMap<Integer, Movie> movies = new HashMap<>();
        movies.put(1, FMovie.create("2001, L'Odysée de l'espace", "Science-fiction", "02:21"));
        movies.put(2, FMovie.create("Interstellar", "Science-focition", "02:49"));
        movies.put(3, FMovie.create("Knight of Cups", "Drame", "01:58"));

        BRequest req1 = new BRequest.Builder(movies)
                .setType(ERequestType.CREATE)
                .setUser(user1)
                .setMovieId(1)
                .build();

        BRequest req2 = new BRequest.Builder(movies)
                .setType(ERequestType.CREATE)
                .setUser(user2)
                .setMovieId(2)
                .build();

        BRequest req3 = new BRequest.Builder(movies)
                .setType(ERequestType.DELETE)
                .setUser(user3)
                .setMovieId(2)
                .build();

        BRequest req4 = new BRequest.Builder(movies)
                .setType(ERequestType.DELETE)
                .setUser(user4)
                .setMovieId(1)
                .build();

        RequestHandler handler1 = new RequestHandler(req1);
        auth.handleRequest(handler1);

        RequestHandler handler2 = new RequestHandler(req2);
        auth.handleRequest(handler2);

        RequestHandler handler3 = new RequestHandler(req3);
        auth.handleRequest(handler3);

        RequestHandler handler4 = new RequestHandler(req4);
        auth.handleRequest(handler4);
    }
}