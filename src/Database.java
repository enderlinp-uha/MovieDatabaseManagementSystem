import java.util.HashMap;

public class Database {
    private HashMap<Integer, Movie> movies = new HashMap<>();

    public Database() {
        SLogger.getIntance().log(ELogType.INFO, "Database initialized");
    }

    public Movie create(Movie movie) {
        this.movies.put(movie.getId(), movie);
        SLogger.getIntance().log(ELogType.INFO, "Movie added to Database: " + movie.getTitle());

        return movie;
    }

    public void update(Integer id, Movie movie) {
        this.movies.put(id, movie);
    }

    public void delete(Integer id) {
        this.movies.remove(id);
    }

    public int getCount() {
        return this.movies.size();
    }
}
