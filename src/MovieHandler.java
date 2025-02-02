import java.util.HashMap;

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
        int id = request.getMovieId();
        HashMap<Integer, Movie> movies = request.getMovies();
        Movie movie = movies.get(id);


        switch (request.getType()) {
            case CREATE:
                if (movies.size() >= MAX_LENGTH) {
                    message = "The database is full";
                } else if (movies.containsKey(id)) {
                    message = "Movie already exists in the database";
                } else {
                    movies.put(movie.getId(), movie);
                    message = "Movie created successfully";
                }
                break;

            case UPDATE:
                if (!movies.containsKey(movie.getId())) {
                    message = "Movie do not exist in the database";
                } else {
                    movies.put(movie.getId(), movie);
                    message = "Movie updated successfully";
                }
                break;

            case DELETE:
                if (!movies.containsKey(movie.getId())) {
                    message = "Movie do not exist in the database";
                } else {
                    movies.remove(movie.getId());
                    message = "Movie deleted successfully";
                }
                break;
        }

        SRequestLogger.getIntance().log(request, message);
    }
}
