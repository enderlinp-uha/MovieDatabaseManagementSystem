import java.util.HashMap;
import java.util.List;

public class MovieHandler implements IRequestHandler {
    private IRequestHandler next = null;
    private final int MAX_LENGTH = 10;
    private String message;

    @Override
    public void setNext(IRequestHandler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(RequestHandler request) {
        Movie movie = request.getMovie();
        List<Movie> movies = movie.getMovies();
        int id = movie.getId();
        String title = movie.getTitle();

        switch (request.getType()) {
            case CREATE:
                if (movies.size() >= MAX_LENGTH) {
                    message = "The database is full";
                } else if (movie.containsTitle(movies, title)) {
                    message = "Movie already exists in the database";
                } else {
                    movies.add(movie);
                    message = "Movie created successfully";
                }
                break;

            case UPDATE:
                if (!movie.containsTitle(movies, title)) {
                    message = "Movie do not exist in the database";
                } else {
                    movies.add(movie);
                    message = "Movie updated successfully";
                }
                break;

            case DELETE:
                if (!movie.containsId(movies, id)) {
                    message = "Movie do not exist in the database";
                } else {
                    movies.remove(movie);
                    message = "Movie deleted successfully";
                }
                break;
        }

        SRequestLogger.getIntance().log(request, message);
        next = null;
    }
}
