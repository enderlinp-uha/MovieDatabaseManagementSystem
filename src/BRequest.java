import java.time.LocalDateTime;

public class BRequest {
    private static int autoIncrement = 0;
    private int id;
    private ERequestType type;
    private String content;
    private User user;
    private Movie movie;
    private LocalDateTime timestamp;

    private BRequest(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.content = builder.content;
        this.user = builder.user;
        this.movie = builder.movie;
        this.timestamp = builder.timestamp;
    }

    public int getId() {
        return id;
    }

    public ERequestType getType() {
        return type;
    }

    public String getContent() {
        return content;
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
        private String content;
        private User user;
        private Movie movie;
        private LocalDateTime timestamp = LocalDateTime.now();

        public Builder setType(ERequestType type) {
            this.type = type;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
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
        return "Request {id=" + id + ", type=" + type + ", timestamp=" + timestamp + ", content=" + content + ", user=" + user + ", movie=" + movie + "}";
    }
}
