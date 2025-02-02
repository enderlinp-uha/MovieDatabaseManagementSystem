public class Main {
    public static void main(String[] args) {
        Database database = SDatabase.getInstance();
        database.create(FMovie.createMovie("2001, L'Odysée de l'espace", "02:21", EMovieCategory.SCIENCE_FICTION));
        database.create(FMovie.createMovie("Interstellar", "02:49", EMovieCategory.SCIENCE_FICTION));
        database.create(FMovie.createMovie("Knight of Cups", "01:58", EMovieCategory.DRAMA));

        User user = FUser.createUser("SpongeBob", EUserRole.USER);
        user.signin();

        User admin = FUser.createUser("John DOE", EUserRole.ADMIN);

        IRequestHandler loggedIn = new ChainLoggedIn();
        IRequestHandler role     = new ChainRole();
        IRequestHandler limit    = new ChainLimit();
        IRequestHandler create   = new ChainCreate();

        loggedIn.setNext(role);
        role.setNext(limit);
        limit.setNext(create);

        Movie movie = FMovie.createMovie("Another Earth", "01:32", EMovieCategory.DRAMA);

        loggedIn.handleRequest(FRequest.createRequestCreate(movie, user));
        loggedIn.handleRequest(FRequest.createRequestCreate(movie, admin));

        admin.signin();
        loggedIn.handleRequest(FRequest.createRequestCreate(movie, admin));
    }
}