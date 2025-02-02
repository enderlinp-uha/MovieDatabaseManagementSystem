import java.util.Date;

public class BRequest {
    private ERequestType type;
    private String date;
    private User user;
    private Movie movie;
    private Integer entry;

    private String conclusion = "";

    private BRequest(RequestBuilder builder) {
        this.type = builder.type;
        this.date = builder.date;
        this.user = builder.user;
        this.movie = builder.movie;
        this.entry = builder.entry;
    }

    public ERequestType getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public User getUser() {
        return user;
    }

    public Movie getMovie() {
        return movie;
    }

    public Integer getEntry() {
        return entry;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    @Override
    public String toString() {
        return "Request{"
                + "type=" + type
                + ", date=" + date
                + ", user=" + user
                + ", movie=" + movie
                + ", entry=" + entry
                + ", conclusion=" + conclusion
                + "}";
    }

    public static class RequestBuilder {
        private ERequestType type;
        private User user;
        private Movie movie;
        private Integer entry;
        private String date;

        public RequestBuilder() {
            this.date = Utils.formattedDate(new Date(), "yyyy-MM-dd HH:mm");
        }

        public RequestBuilder setType(ERequestType type) {
            this.type = type;
            return this;
        }

        public RequestBuilder setUser(User user) {
            this.user = user;
            return this;
        }

        public RequestBuilder setMovie(Movie movie) {
            this.movie = movie;
            return this;
        }

        public RequestBuilder setEntry(Integer entry) {
            this.entry = entry;
            return this;
        }

        public BRequest build() {
            return new BRequest(this);
        }
    }
}
