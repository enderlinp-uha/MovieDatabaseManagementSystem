import java.time.LocalDateTime;

public class BRequest {
    private int id;
    private EType type;
    private LocalDateTime timestamp;
    private String comment;
    private User author;
    private int movieId;

    private BRequest(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.comment = builder.comment;
        this.author = builder.author;
        this.movieId = builder.movieId;
    }

    public static class Builder {
        private int id;
        private EType type;
        private LocalDateTime timestamp = LocalDateTime.now();
        private String comment;
        private User author;
        private int movieId;

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

        public Builder setComment(String comment) {
            this.comment = comment;
            return this;
        }

        public Builder setAuthor(User author) {
            this.author = author;
            return this;
        }

        public Builder setMovieId(int movieId) {
            this.movieId = movieId;
            return this;
        }

        public BRequest build() {
            return new BRequest(this);
        }
    }

    @Override
    public String toString() {
        return "Request {id=" + id + ", type=" + type + ", timestamp=" + timestamp + ", comment=" + comment + ", author=" + author + ", movieId=" + movieId + "}";
    }
}
