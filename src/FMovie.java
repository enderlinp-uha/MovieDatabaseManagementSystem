public class FMovie {
    private static int id = 0;

    public static Movie createMovie(String title, String duration, EMovieCategory category) {
        return new Movie(++id, title, duration, category);
    }
}
