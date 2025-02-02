import java.time.LocalDateTime;
import java.util.HashMap;

public class BRequest {
    private static int autoIncrement = 0;
    private int id;
    private ERequestType type;
    private User user;
    private int movieId;
    private HashMap<Integer, Movie> movies;

    private BRequest(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.user = builder.user;
        this.movieId = builder.movieId;
        this.movies = builder.movies;
    }

    public int getId() {
        return id;
    }

    public ERequestType getType() {
        return type;
    }

    public User getUser() {
        return user;
    }

    public int getMovieId() {
        return movieId;
    }

    public HashMap<Integer, Movie> getMovies() {
        return movies;
    }

    public static class Builder {
        private int id;
        private ERequestType type;
        private User user;
        private int movieId;
        private HashMap<Integer, Movie> movies;

        public Builder(HashMap<Integer, Movie> movies) {
            this.movies = movies;
        }

        public Builder setType(ERequestType type) {
            this.type = type;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder setMovieId(int movieId) {
            this.movieId = movieId;
            return this;
        }

        public BRequest build() {
            this.id = ++autoIncrement;
            return new BRequest(this);
        }
    }

    @Override
    public String toString() {
        return "Request {id=" + id + ", type=" + type + ", user=" + user + ", movieId=" + movieId + "}";
    }
}
