public class FMovie {
    private static int id = 0;

    public static Movie create(String title, String category, String duration) {
        return new Movie(++id, title, category, duration);
    }
}
