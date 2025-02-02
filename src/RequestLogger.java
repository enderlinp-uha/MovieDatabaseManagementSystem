import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RequestLogger {
    private ERequestType type;
    private String title;
    private String message;
    private List<RequestLogger> logs = new ArrayList<>();

    public RequestLogger() {}

    public RequestLogger(ERequestType type, String title, String message) {
        this.type = type;
        this.title = title;
        this.message = message;
    }

    public void log(RequestHandler request, String message) {
        int id = request.getMovieId();
        HashMap<Integer, Movie> movies = request.getMovies();
        Movie movie = movies.get(id);

        RequestLogger entry = new RequestLogger(request.getType(), movie.getTitle(), message);
        logs.add(entry);
        System.out.println(entry);
    }

    @Override
    public String toString() {
        return "[" + LocalDateTime.now() + "] " + this.type + " - Film: " + this.title + " - " + this.message;
    }
}
