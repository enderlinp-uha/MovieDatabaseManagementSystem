import java.time.LocalDateTime;

public class BRequest {
    private int id;
    private EType type;
    private LocalDateTime timestamp;
    private String message;
    private User author;
    private Movie movie;

    private BRequest(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.message = builder.message;
        this.author = builder.author;
        this.movie = builder.movie;
    }

    public static class Builder {
        private int id;
        private EType type;
        private LocalDateTime timestamp = LocalDateTime.now();
        private String message;
        private User author;
        private Movie movie;

        public Builder() {}

        public User getAuthor() {
            return this.author;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setType(EType type) {
            this.type = type;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setAuthor(User author) {
            this.author = author;
            return this;
        }

        public Builder setMovie(Movie movie) {
            this.movie = movie;
            return this;
        }

        public BRequest build() {
            return new BRequest(this);
        }
    }

    @Override
    public String toString() {
        return "Request {id=" + id + ", type=" + type + ", timestamp=" + timestamp + ", message=" + message + ", author=" + author + ", movie=" + movie + "}";
    }
}
