import java.util.ArrayList;
import java.util.List;

public class Movie {
    private int    id;
    private String title;
    private String category;
    private String duration;
    private List<Movie> movies = new ArrayList<>();

    public Movie(int id, String title, String category, String duration) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    /*public void update(ERequestType type) {
        switch (type) {
            case CREATE, UPDATE:
                movies.put(id, this);
                break;

            case DELETE:
                movies.remove(id);
        }
    }*/

    /*public Map<Integer, Movie> getMovies() {
        return movies;
    }*/

    public boolean containsId(List<Movie> movies, int id) {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public boolean containsTitle(List<Movie> movies, String title) {
        for (Movie movie : movies) {
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
