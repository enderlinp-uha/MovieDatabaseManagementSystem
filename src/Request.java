public class Request {
    private int id;
    private EType type;
    private int timestamp;
    private String comment;
    private String author;
    private String filmId;

    private Request(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.timestamp = builder.timestamp;
        this.comment = builder.comment;
        this.author = builder.author;
        this.filmId = builder.filmId;
    }

    public static class Builder {
        private int id;
        private EType type;
        private int timestamp;
        private String comment;
        private String author;
        private String filmId;

        public Builder() {}

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setType(EType type) {
            this.type = type;
            return this;
        }

        public Builder setTimestamp(int timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder setComment(String comment) {
            this.comment = comment;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Request build() {
            return new Request(this);
        }
    }

    @Override
    public String toString() {
        return "Request: [id=" + id + ", type=" + type + ", timestamp=" + timestamp + ", comment=" + comment + ", author=" + author + ", filmId=" + filmId + "]";
    }
}
