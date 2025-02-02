public class Main {
    public static void main(String[] args) {
        Database database = SDatabase.getInstance();
        database.create(FMovie.createMovie("2001, L'Odysée de l'espace", "02:21", EMovieCategory.SCIENCEFICTION));
        database.create(FMovie.createMovie("Interstellar", "02:49", EMovieCategory.SCIENCEFICTION));
        database.create(FMovie.createMovie("Knight of Cups", "01:58", EMovieCategory.DRAMA));

        IRequestHandler loggedIn = new ChainLoggedIn();
        IRequestHandler role     = new ChainRole();
        IRequestHandler movie    = new ChainMovie();

        loggedIn.setNext(role);
        role.setNext(movie);

        User user = FUser.createUser("SpongeBob", EUserRole.USER);
        user.signin();

        User admin = FUser.createUser("John DOE", EUserRole.ADMIN);

        //

        admin.signin();

        /*RequestHandler handler1 = new RequestHandler(req1);
        auth.handleRequest(handler1);

        RequestHandler handler2 = new RequestHandler(req2);
        auth.handleRequest(handler2);

        RequestHandler handler3 = new RequestHandler(req3);
        auth.handleRequest(handler3);

        RequestHandler handler4 = new RequestHandler(req4);
        auth.handleRequest(handler4);*/
    }
}