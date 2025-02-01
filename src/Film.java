import java.util.ArrayList;
import java.util.HashMap;

public class Film {
    private int id;
    private String title;
    private String category;
    private String duration;
    private ArrayList<Film> films = new ArrayList<>();

    public Film(int id, String title, String category, String duration) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.duration = duration;
    }

    public void create() {
        films.add(new Film(id, title, category, duration));
    }

    public void delete(int id) {
        films.remove(id);
    }

    public void update(int id, String title, String category, String duration) {
        films.set(id, new Film(id, title, category, duration));
    }

    public void showFilms() {
        for (Film film : films) {
            System.out.println(film);
        }
    }

    @Override
    public String toString() {
        return "Film {id=" + id + ", title=" + title + ", category=" + category + ", duration=" + duration + "}";
    }
}
