import java.util.ArrayList;
import java.util.List;

public class Movie {
    private int id;
    private String title;
    private String category;
    private String duration;
    private List<Movie> movies = new ArrayList<>();

    public Movie() {}

    public Movie(int id, String title, String category, String duration) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.duration = duration;
    }

    public void create() {
        movies.add(new Movie(id, title, category, duration));
    }

    public void delete(int id) {
        movies.remove(id);
    }

    public void update(int id, String title, String category, String duration) {
        movies.set(id, new Movie(id, title, category, duration));
    }

    @Override
    public String toString() {
        return "Movie {id=" + id + ", title=" + title + ", category=" + category + ", duration=" + duration + "}";
    }
}
