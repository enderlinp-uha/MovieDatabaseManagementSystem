import java.util.Map;

public class MovieHandler implements IRequestHandler {
    private IRequestHandler next = null;
    private final int MAX_LENGTH = 10;
    private String message;
    private Logger logger = new Logger();

    @Override
    public void setNext(IRequestHandler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(RequestHandler request) {
        Movie movie = request.getMovie();
        Map<Integer, Movie> movies = movie.getMovies();
        int id = movie.getId();

        switch (request.getType()) {
            case CREATE:
                if (movies.size() >= MAX_LENGTH) {
                    message = "The database is full";
                } else if (movies.containsKey(id)) {
                    message = "Movie already exists in the database";
                } else {
                    movies.put(id, movie);
                    message = "Movie created successfully";
                }
                break;

            case UPDATE:
                if (!movies.containsKey(id)) {
                    message = "Movie do not exist in the database";
                } else {
                    movies.put(id, movie);
                    message = "Movie updated successfully";
                }
                break;

            case DELETE:
                if (!movies.containsKey(id)) {
                    message = "Movie do not exist in the database";
                } else {
                    movies.remove(id);
                    message = "Movie deleted successfully";
                }
                break;
        }

        logger.log(request, message);
    }
}
