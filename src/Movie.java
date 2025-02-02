import java.util.HashMap;
import java.util.Map;

public class Movie {
    private int    id;
    private String title;
    private String category;
    private String duration;
    private Map<Integer, Movie> movies = new HashMap<>();

    public Movie(int id, String title, String category, String duration) {
        this.id       = id;
        this.title    = title;
        this.category = category;
        this.duration = duration;
        this.movies.put(id, this);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void update(ERequestType type) {
        switch (type) {
            case CREATE, UPDATE:
                movies.put(id, this);
                break;

            case DELETE:
                movies.remove(id);
        }
    }

    public Map<Integer, Movie> getMovies() {
        return movies;
    }

    public boolean containsTitle(Map<Integer, Movie> movies, String title) {
        for (Movie movie : movies.values()) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Movie {id=" + id + ", title=" + title + ", category=" + category + ", duration=" + duration + "}";
    }
}
