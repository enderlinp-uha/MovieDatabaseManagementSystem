public class FFilm {
    public static Film create(int id, String title, String category, String duration) {
        return new Film(id, title, category, duration);
    }
}
