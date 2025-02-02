public class Movie {
    private int    id = 0;
    private String title = "";
    private String duration = "";
    private EMovieCategory category;

    public Movie(int id, String title, String duration, EMovieCategory category) {
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

    public String getDuration() {
        return duration;
    }

    public EMovieCategory getCategory() {
        return category;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Movie{"
                + "id=" + id
                + ", title=" + title
                + ", duration=" + duration
                + ", category=" + category
                + "}";
    }
}
