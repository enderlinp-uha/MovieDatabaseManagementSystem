public class FMovie {
    public static Movie create(int id, String title, String category, String duration) {
        return new Movie(id, title, category, duration);
    }
}
