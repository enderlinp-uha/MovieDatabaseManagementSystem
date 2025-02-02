import java.time.LocalDateTime;

public class BRequest {
    private static int autoIncrement = 0;
    private int id;
    private ERequestType type;
    private User user;
    private Movie movie;

    private BRequest(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.user = builder.user;
        this.movie = builder.movie;
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

    public Movie getMovie() {
        return movie;
    }

    public static class Builder {
        private int id;
        private ERequestType type;
        private User user;
        private Movie movie;

        public Builder setType(ERequestType type) {
            this.type = type;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder setMovie(Movie movie) {
            this.movie = movie;
            return this;
        }

        public BRequest build() {
            this.id = ++autoIncrement;
            return new BRequest(this);
        }
    }

    @Override
    public String toString() {
        return "Request {id=" + id + ", type=" + type + ", user=" + user + ", movie=" + movie + "}";
    }
}
